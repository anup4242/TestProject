package com.shopnow.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopnow.item.Item;
import com.shopnow.model.Order;
import com.shopnow.model.Orderss_Details;
import com.shopnow.model.Products;
import com.shopnow.model.User;
import com.shopnow.service.OrderService;
import com.shopnow.service.ProductService;
import com.shopnow.service.UserService;

@Controller
public class UserController 
{
	
	@Autowired
	private UserService userServer;
	
	@Autowired
	private OrderService oservice;
	
	@Autowired
	private ProductService productSer ;
	
	
	@GetMapping("/home_user")
	public String homeUser()
	{
		return "home_user";
	}
	
	
	@GetMapping("/product_user")
	public ModelAndView showProduct()
	{
		List<Products> list = productSer.getAllProducts();
		ModelAndView m = new ModelAndView("product_user");
		
		m.addObject("ListOfProducts", list);
		return m;
		
	}
	
	@GetMapping("/contact_us")
	public String contact()
	{
		return "contact_us";
	}
	
	
	@GetMapping("/cart")
	public String addItemToCart(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		
		ArrayList<Item> list =(ArrayList<Item>) session.getAttribute("itemlist");
		
		if(list==null)
		{
			return "redirect:/signin";
		}
		else
		{
			int productid = Integer.parseInt(request.getParameter("id"));
			System.out.println("idddddddddddddddddd"+productid);
			
			double total = (double) session.getAttribute("total");
			
			Products pr = productSer.getProductById(productid);
			
		
			
	//		System.out.println("qqqqqqqqqqqqqqqq"+request.getParameter("quan"));
		
			int qun = Integer.parseInt(request.getParameter("quan"));
			
			total=total+pr.getPrice()*qun;
					
			
			boolean isPresent =false;
			for(Item i: list)
			{
				if(i.getItemid()==pr.getPid())
				{
					int q=i.getQuantity();
					i.setQuantity(q+qun);
					isPresent =true;
				}
			}
			
			if(!isPresent)
			{
				
		
			list.add(new Item(pr.getPid(),pr.getPname(),pr.getPrice(),qun));
			
			
			}
	//		int total =(pr.getPrice())*qun;
			
			session.setAttribute("itemlist", list);
			session.setAttribute("total", total);
			
			return "forward:/product_user";
			
			
		}
		
	}
	
	@GetMapping("/viewcart")
	public String showCart(HttpServletRequest request,Model m)
	{
		HttpSession session = request.getSession(false);
		if(session==null)
			m.addAttribute("Status", "Oppss! Your Cart is Empty!!");
		else
		{
			ArrayList<Item> ilist =(ArrayList<Item>) session.getAttribute("itemlist");
			m.addAttribute("itemlist", ilist);
		}
		
		return "viewcart";
	}
	
	@GetMapping("/removeitem")
	public String showCartAfterItemRemoved(HttpServletRequest request,Model m)
	{
		HttpSession session = request.getSession(false);
		if(session==null)
			m.addAttribute("Status", "Oppss! Your Cart is Empty!!");
		
		else
		{
		
		ArrayList<Item> ilist =(ArrayList<Item>) session.getAttribute("itemlist");
		
		int productid = Integer.parseInt(request.getParameter("id"));
		
		Products pr =productSer.getProductById(productid);
		
		double total = (double) session.getAttribute("total");
		
	
		
		for(Item i : ilist)
		{
			if(i.getItemid() == pr.getPid())
			{
				ilist.remove(i);
			}
			
		}
		
		total=0.0;
		
		for (Item i : ilist)
		{
			int price=i.getItemprice();
			int quantity=i.getQuantity();
			
			total = total+(price*quantity);
		
		}
		
		
		
		
		session.setAttribute("total", total);
		

		m.addAttribute("itemlist", ilist);
		
		}
		
		return "viewcart";
	}
	
	
	
//	@GetMapping("/order")
//	public String shippingAddress()
//	{
//		return "order";
//	}
	
	@GetMapping("/order")
	public String placeOrder(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		
		ArrayList <Item> itemCart = (ArrayList<Item>) session.getAttribute("itemlist");
		
		List<Products> list = productSer.getAllProducts();
		
		User user = (User) session.getAttribute("user");
		
		Order order = new Order();
		
		LocalDate datee=LocalDate.now();
		
		
		order.setDate(datee);
		
		
		order.setUser(user);
		
	//	int userid=(int) session.getAttribute("userid");
		List <Orderss_Details> od = order.getOrd();
		
		for(Products pr : list)
		{
			for(Item item: itemCart)
			{
				if(item.getItemid()==pr.getPid())
				{
					od.add(new Orderss_Details(order,pr,item.getQuantity()));
					break;
				}
			}
		}
		
	//	od.setQuantity(1);
	//	od.setOrder(new Order(ur,));
	
		oservice.insertOrder(order);
		
		return "order_details";
	}
	
	
	
	
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req)
	{
		HttpSession sess = req.getSession();
		
		if(sess!=null)
		{
			sess.invalidate();
		}
		
		return "welcome";
	}
	

}

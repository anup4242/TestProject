package com.shopnow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopnow.model.Material_Inward;
import com.shopnow.model.Products;
import com.shopnow.service.ProductService;



@Controller
public class ProductsController 
{
	@Autowired
	private  ProductService pserv;
	
	@GetMapping("/home_admin")
	public String adminHome()
	{
		return  "home_admin";
	}
	
	
	//
	//Admin Product Crud Operation
	//
	
	
	
	@GetMapping("/product_admin")
	public ModelAndView startPage()
	{
		
		List <Products> list = pserv.getAllProducts();
		
		ModelAndView mv = new ModelAndView("product_admin");
		
		mv.addObject("ListOfProduct", list);
		
		return mv;
		
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam ("id") int pid)
	{
		Products pr = pserv.getProductById(pid);
	
		if(pr!=null)
		{
			pserv.deleteProduct(pr);
		}
	
	return "redirect:/product_admin";
		
	}
	
	@GetMapping("/add")
	public String addProduct()
	{
	return "addproduct";
	}
	
	@GetMapping("/save")
	public String saveProduct(@ModelAttribute("p1") Products pr)
	{
		pserv.addProduct(pr);
		
		return "redirect:/product_admin";
	}
	
	@GetMapping("/edit")
	public ModelAndView editProduct(@RequestParam("id") int id)
	{
	Products pr = pserv.getProductById(id);
	ModelAndView mv = new ModelAndView("edit_product");
	mv.addObject("Product",pr);
	return mv;
	}
	
	@PostMapping("/update")
	public String updateProduct(@ModelAttribute Products prod)
	{
		pserv.editProduct(prod);
		return "redirect:/product_admin";
	}
	

	

	
	
	//
	// Stock
	//
	
	
	
	@GetMapping("/stock")
	public ModelAndView showStock()
	{
		
		List <Products> list = pserv.getAllProducts();
		
		ModelAndView mv = new ModelAndView("stock");
		
		mv.addObject("stockofproducts", list);
		
		return mv;
		
	}
	
	
	//
	// Material Inward
	//
	
	
	
	@GetMapping("/material_inward")
	public String inwardPg()
	{
		return "material_inward";
	}
	
	@GetMapping("/addmaterial")
	public String addMaterial(@RequestParam ("pid") int pid,@RequestParam("mquan") int q)
	{
		pserv.addMaterial(pid, q);
		
		return "redirect:/home_admin";
	}
	
	
	
	
}

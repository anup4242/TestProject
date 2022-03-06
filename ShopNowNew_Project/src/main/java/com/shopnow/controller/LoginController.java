package com.shopnow.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shopnow.item.Item;
import com.shopnow.model.User;
import com.shopnow.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userSer;

	@GetMapping("/")
	public String welcomeP() 
	{
		
		return "welcome";
	}
	
	@GetMapping("/welcomepagge")
	public String welcomePage() 
	{
		
		return "welcome";
	}

	@GetMapping("/signin")
	public String signin(Model m, HttpServletRequest req) {

		return "signin";

		// return "table";
	}

	@GetMapping("/signup")
	public String signup(Model m, HttpServletRequest req) {
		return "signup";
	}

	@PostMapping("/gotosignup")
	public String addUser(@ModelAttribute User u) 
	{
	
		userSer.insertUser(u);
		
		return "redirect:/signin";
	}

	@GetMapping("/check_user")
	public String ValidateUser(@ModelAttribute User user, HttpServletRequest req)
	{
		
		
		String uname = user.getUsername();
		String pass = user.getPassword();
		
		List<User> ulist = userSer.getUserByName(uname);
		
		if (ulist==null || ulist.size() == 0) 
		{
			req.setAttribute("status", "Invalid username and password");
			return "forward:/signin";
		} 
		
//		else if(ur.getUsername().equals("anupp") && ur.getPassword().equals("anup0231"))
//		{
//			return "forward:/home_admin";
//		}
		
		else 
		{
		
			User ur=null;
			for(User u:ulist)
			{
				if(BCrypt.checkpw(pass, u.getPassword()))
				{
					ur=u;
					break;
				}
					
			}
			
			if(ur==null)
			{
				req.setAttribute("status", "Invalid password");
				return "forward:/signin";
			
			}
			
			HttpSession session = req.getSession();
			ArrayList<Item> itemlist = new ArrayList<Item>();
			session.setAttribute("itemlist", itemlist);
			session.setAttribute("username",ur.getUsername());
			session.setAttribute("userid",ur.getUserid());
			session.setAttribute("user", ur);
			session.setAttribute("total", 0.0);
			
			if(ur.getRole().getRoleName().equalsIgnoreCase("admin"))
			{
				return "forward:/home_admin";
			}
			
			else
			return "home_user";
		
		}
		
		
		
		
		
	}

}

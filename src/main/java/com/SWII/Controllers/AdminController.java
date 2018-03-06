package com.SWII.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.AdminEntity;
import com.SWII.Entity.Product;
import com.SWII.Repositories.AdminRepository;

@Controller
@RequestMapping("admin")
public class AdminController {
	@Autowired
	AdminRepository adminRepository;
	
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String Show(Model model) {
		model.addAttribute("admin", new AdminEntity());
		return "AdminSignIn";
	}
	
	@RequestMapping(value="/signin",method=RequestMethod.POST)
	public String SignIn(Model model ,@ModelAttribute AdminEntity admin) {
		model.addAttribute("admin", new AdminEntity());
		AdminEntity adminFromDb=adminRepository.findById(admin.getEmail()).get();
		System.out.println(admin.getPassword()+"----"+adminFromDb.getPassword());
		if(adminFromDb.getPassword().equals(admin.getPassword())){
			return "signedin";
		}
		return "ww";
	}
	/*
	@RequestMapping(value="/add-product",method=RequestMethod.POST)
	public String addProduct(ProductController controller) {
		
	}*/
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
	public String addProductForm(Model model) {
		model.addAttribute("product",  new  Product());
		return "AddProduct";
	}
	
	
	
	
	
}

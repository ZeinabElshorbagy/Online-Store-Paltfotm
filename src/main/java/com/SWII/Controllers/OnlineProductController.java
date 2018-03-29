package com.SWII.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.OnlineProductEntity;
import com.SWII.Services.OnlineProductServices;

@Controller
@RequestMapping("/onlineProduct")
public class OnlineProductController {
	
	@Autowired
	OnlineProductServices productServices; 
	
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public boolean addProduct(Model model ,@ModelAttribute OnlineProductEntity product) {
		model.addAttribute("product", new OnlineProductEntity());
		if(productServices.saveProduct(product)) {
			return true;
		}else {
			return false;
		}
	}
	
}

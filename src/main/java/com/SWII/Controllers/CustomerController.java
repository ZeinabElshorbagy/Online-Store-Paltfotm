package com.SWII.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.Customer;
import com.SWII.Repositories.CustomerRepository;


@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired 
	CustomerRepository customerRepo;
	
	@RequestMapping(value="/Register", method=RequestMethod.GET)
	public String registerForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "CustomerRegister";
	}
	
    @RequestMapping(value="/Register",  method=RequestMethod.POST)
	public  String register(Model model,@ModelAttribute  Customer customer) {
		model.addAttribute("customer",new Customer());
		if(!customerRepo.existsById(customer.getUserName())) {
			customerRepo.save(customer);
			return "";
		}else {
			return "User Name Exists";
		}
    	
	}
    
    
    /******************************
    
    @RequestMapping(value="/signIn", method=RequestMethod.GET)
	public String signInForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "CustomerRegister";
		
	}
	
    @RequestMapping(value="/signIn",  method=RequestMethod.POST)
	public  String signIn(Model model,@ModelAttribute  Customer customer) {
		model.addAttribute("customer",new Customer());
		if(!customerRepo.existsById(customer.getUserName())) {
			customerRepo.save(customer);
			return "";
		}else {
			return "User Name Exists";
		}
    	
	}*/
}

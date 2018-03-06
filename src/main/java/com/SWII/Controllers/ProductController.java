package com.SWII.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.OnlineProductEntity;
import com.SWII.Entity.Product;
import com.SWII.Repositories.ProductRepo;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepo<Product> productRepo;
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public boolean addProduct(Model model ,@ModelAttribute OnlineProductEntity product) {
		model.addAttribute("product",new Product());
		if(productRepo.existsById(product.getProductId())) {
			return false;
		}else {
			productRepo.save(product);
			return true;
		}
	}
	
}

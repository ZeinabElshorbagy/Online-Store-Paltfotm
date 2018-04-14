package com.SWII.Controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SWII.Entity.BoughtProductsEntity;
import com.SWII.Entity.CustomerEntity;
import com.SWII.Entity.StoreEntity;
import com.SWII.Services.BoughtProductsServices;
import com.SWII.Services.StoreServices;

@RestController
@RequestMapping("/buy")
public class BoughtProductsController {
	
	@Autowired
	BoughtProductsServices boughtProductsService;
	
	@Autowired
	StoreServices storeService;
	
	@RequestMapping(value="/{storeId}/{productId}",method=RequestMethod.POST)
	public  boolean addBoughtProduct(@PathVariable("storeId") String storId, @PathVariable("productId") String productId, String customers,
			int quantaty, Date deliveryDate, Date orderDate) {
		
		System.out.println(storId+"--------"+productId);
		BoughtProductsEntity boughtProduct = new BoughtProductsEntity();
		CustomerEntity customer=null;//TODO mn el session
		boughtProduct.setCustomers(customer);
		boughtProduct.setDeliveryDate(deliveryDate);
		boughtProduct.setNumberOfViews(0);
		boughtProduct.setOrderDate(orderDate);
		boughtProduct.setQuantaty(quantaty);
		if(boughtProductsService.saveBoght(boughtProduct))
			return true;
		else
			return false;

	}
}

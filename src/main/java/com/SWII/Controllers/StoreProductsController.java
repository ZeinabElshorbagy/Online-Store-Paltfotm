package com.SWII.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.SWII.Entity.StoreProductsEntity;
import com.SWII.Repositories.StoreProductsRepository;

@Controller
public class StoreProductsController {

	@Autowired
	StoreProductsRepository storeProductRepo;
	
	public List<StoreProductsEntity> getNumberOfViews(String storeId){
		List<StoreProductsEntity> views = new ArrayList<>();
		views = storeProductRepo.findBystores(storeId);
		return views;
	}
}

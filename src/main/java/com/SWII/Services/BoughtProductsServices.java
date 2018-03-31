package com.SWII.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWII.Entity.BoughtProductsEntity;
import com.SWII.Repositories.BoughtProductsRepository;

@Service
public class BoughtProductsServices {
	@Autowired
	BoughtProductsRepository boughtProductsRepo;
	
	public boolean saveBoght(BoughtProductsEntity BOE) {
		boughtProductsRepo.save(BOE);
		return true;
	}
}

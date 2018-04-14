package com.SWII.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWII.Entity.StoreEntity;
import com.SWII.Entity.StoreProductsEntity;
import com.SWII.Repositories.StoreProductsRepository;

@Service
public class StoreProductsServices {

	@Autowired
	StoreProductsRepository storeProductRepo;
	

	public List<StoreProductsEntity> getStoreProduct(StoreEntity storeId){
		return storeProductRepo.findBystores(storeId);
	}
	
	public boolean saveProduct(StoreProductsEntity entity) {
		return storeProductRepo.save(entity) != null;
	}
	
}

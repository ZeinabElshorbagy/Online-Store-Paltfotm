package com.SWII.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWII.Entity.OnlineStoreEntity;
import com.SWII.Repositories.OnlineStoreRepo;

@Service
public class OnlineStoreServices {
	@Autowired
	OnlineStoreRepo onlineStoreRepo;
	
	public OnlineStoreEntity getStore(String storeId) {
		if(onlineStoreRepo.existsById(storeId))
			return onlineStoreRepo.findById(storeId).get();
		return null;
	}
}

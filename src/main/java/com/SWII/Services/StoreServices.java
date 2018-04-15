package com.SWII.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWII.Entity.StoreEntity;
import com.SWII.Repositories.StoreRepository;

@Service
public class StoreServices {

	@Autowired
	StoreRepository storeService;

	@Autowired
	StoreOwnerServices ownerService;

	public boolean saveStore(StoreEntity store) {
		if (ownerService.exist(store.getStoreOwner().getUserId())) {
			storeService.save(store);
			return true;
		}
		return false;
	}
}

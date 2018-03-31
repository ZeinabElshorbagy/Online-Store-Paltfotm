package com.SWII.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWII.Entity.OnlineStoreEntity;
import com.SWII.Entity.Store;

@Service
public class StoreServices {

	@Autowired
	OnlineStoreServices onlineStoreService;
	
	@Autowired
	OfflineStoreServices offlineStoreService;
	
	public Store getStore(String storeId) {
		OnlineStoreEntity onlineStore = onlineStoreService.getStore(storeId);
		if(onlineStore!=null)
			return onlineStore;
		else
			return(offlineStoreService.getStore(storeId));
	}
}

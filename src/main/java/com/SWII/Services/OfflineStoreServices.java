package com.SWII.Services;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.SWII.Entity.OfflineStoreEntity;
import com.SWII.Entity.OnlineProductEntity;
import com.SWII.Entity.StoreOwnerEntity;
import com.SWII.Repositories.OfflineStoreRepo;

@Service
public class OfflineStoreServices {
	
	@Autowired
	OfflineStoreRepo offlineStoreRepo;
	
	public boolean addStore(Model model ,@ModelAttribute OfflineStoreEntity store,HttpSession session) {
		model.addAttribute("store", new OnlineProductEntity());
		if(offlineStoreRepo.existsById(store.getStoreId())) {
			return false;
		}else {

			StoreOwnerEntity owner = (StoreOwnerEntity) session.getAttribute("owner");
			store.setStatus(false);
			store.setProducts(null);
			store.setNumberOfView(0);
			store.setStoreId(store.getName());
			store.setStoreOwner(owner);
			offlineStoreRepo.save(store);
			return true;
		}
	}
	public OfflineStoreEntity getStore(String storeId) {
		if(offlineStoreRepo.existsById(storeId))
			return offlineStoreRepo.findById(storeId).get();
		return null;
	}
	
	public boolean findStore(String storeId) {
		if(offlineStoreRepo.existsById(storeId))
			return true;
		return false;
	}
	
	public boolean saveStore(OfflineStoreEntity offlineStore) {
		if(offlineStoreRepo.existsById(offlineStore.getStoreId())) {
			offlineStoreRepo.save(offlineStore);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
}

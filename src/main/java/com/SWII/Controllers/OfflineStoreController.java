package com.SWII.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.OfflineStoreEntity;
import com.SWII.Entity.OnlineProductEntity;
import com.SWII.Entity.StoreOwnerEntity;
import com.SWII.Repositories.OfflineStoreRepo;





@Controller
@RequestMapping("/offlinestore")
public class OfflineStoreController {
	@Autowired
	OfflineStoreRepo storeRepo; 
	
	@RequestMapping(value="/addstore",method=RequestMethod.POST)
	public boolean addStore(Model model ,@ModelAttribute OfflineStoreEntity store,HttpSession session) {
		model.addAttribute("store", new OnlineProductEntity());
		if(storeRepo.existsById(store.getStoreId())) {
			return false;
		}else {

			StoreOwnerEntity owner = (StoreOwnerEntity) session.getAttribute("owner");
			store.setStatus(false);
			store.setProducts(null);
			store.setNumberOfView(0);
			store.setStoreId(store.getName());
			store.setStoreOwner(owner);
			storeRepo.save(store);
			return true;
		}
	}
}

package com.SWII.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.OfflineStoreEntity;
import com.SWII.Entity.OnlineProductEntity;
import com.SWII.Repositories.OfflineStoreRepo;





@Controller
@RequestMapping("/offlinestore")
public class OfflineStoreController {
	@Autowired
	OfflineStoreRepo storeRepo; 
	
	@RequestMapping(value="/addstore",method=RequestMethod.POST)
	public boolean addStore(Model model ,@ModelAttribute OfflineStoreEntity store) {
		model.addAttribute("store", new OnlineProductEntity());
		if(storeRepo.existsById(store.getStoreId())) {
			return false;
		}else {
			store.setStatus(false);
			store.setProducts(null);
			store.setNumberOfView(0);
			store.setStoreId("1");
			//store.setStoreOwner("1");
			storeRepo.save(store);
			return true;
		}
	}
}

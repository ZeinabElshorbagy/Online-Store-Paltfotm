package com.SWII.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.OnlineStoreEntity;
import com.SWII.Entity.StoreOwnerEntity;
import com.SWII.Repositories.OnlineStoreRepo;




@Controller
@RequestMapping("/onlinestore")
public class OnlineStoreController {
	@Autowired
	OnlineStoreRepo storeRepo; 
	
	@RequestMapping(value="/addstore",method=RequestMethod.POST)
<<<<<<< HEAD

=======
>>>>>>> 90701378de76dac987df6374b782d808f9bbbcb2
	public boolean addStore(Model model ,@ModelAttribute OnlineStoreEntity store,HttpSession session) {
		model.addAttribute("store", new OnlineStoreEntity());
		if(storeRepo.existsById(store.getStoreId())) {
			return false;
		}else {
			StoreOwnerEntity owner = (StoreOwnerEntity) session.getAttribute("owner");
			//store.setStatus(false);
			//store.setProducts(null);
			store.setNumberOfView(0);
			store.setStoreId(store.getName());
			store.setStoreOwner(owner);
			storeRepo.save(store);
			return true;
		}
	}
}

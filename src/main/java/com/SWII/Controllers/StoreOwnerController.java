package com.SWII.Controllers;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SWII.Entity.OnlineStoreEntity;
import com.SWII.Entity.Store;
import com.SWII.Entity.StoreOwnerEntity;
import com.SWII.Repositories.StoreOwnerRepository;

@Controller
@RequestMapping("storeowner")
public class StoreOwnerController {
	@Autowired
	StoreOwnerRepository storeOwnerRepo;

	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String registerForm(Model model) {
		model.addAttribute("storeOwner", new StoreOwnerEntity());
		return "StoreOwnerRegister";
	}

	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String register(Model model, @ModelAttribute StoreOwnerEntity storeOwner) {
		model.addAttribute("storeOwner", new StoreOwnerEntity());
		if (!storeOwnerRepo.existsById(storeOwner.getUserName())) {
			storeOwnerRepo.save(storeOwner);
			return "";
		} else {
			return "User Name Exists";
		}
	}

	/********************************************/
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String Show(Model model) {
		model.addAttribute("storeOwner", new StoreOwnerEntity());
		return "StoreOwnerSignIn";
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String SignIn(Model model, @ModelAttribute StoreOwnerEntity storeOwner, HttpSession session) {
		model.addAttribute("storeOwner", new StoreOwnerEntity());
		StoreOwnerEntity storeOwnerFormdb = storeOwnerRepo.findById(storeOwner.getUserName()).get();
		System.out.println(storeOwner.getPassword() + "----" + storeOwnerFormdb.getPassword());
		if (storeOwnerFormdb.getPassword().equals(storeOwner.getPassword())) {
			session.setAttribute("storeOwner", new StoreOwnerEntity());
			return "signedin";
		}
		return "ww";
	}

	/******************************************************************/
	@RequestMapping(method = RequestMethod.GET)
	public String displayStores(Model model,HttpSession session) {
		Set<Store> stores; /** = 7aga ma btrg3 stores eli b id el store owner**/
		model.addAttribute("stores", new OnlineStoreEntity() );
		return "";
		
	}
	/******************************************************************/

//	@RequestMapping(method = RequestMethod.GET)
//	public String ShowStatistics(Model model
//			, @ModelAttribute StoreOwnerEntity storeOwne, HttpSession session) {
//		
//		Store store = (Store) session.getAttribute("store");
//		store.getNumberOfView();
//		return "";
//	}
}
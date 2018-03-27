package com.SWII.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWII.Entity.AdminEntity;
import com.SWII.Repositories.AdminRepository;

@Service
public class AdminServices {

	@Autowired
	AdminRepository adminRepo;

	public AdminEntity loadUserByUserName(String userName, String password) {
		AdminEntity admin = adminRepo.findById(userName).get();
		if (admin.getPassword().equals(password)) {
			return admin;
		}else {
			return null;
		}
	}
}

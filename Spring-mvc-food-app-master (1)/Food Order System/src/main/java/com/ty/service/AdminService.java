package com.ty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.dao.AdminDao;
import com.ty.dto.Admin;

@Component
public class AdminService {

	@Autowired
	AdminDao adminDao ;
	
	public void saveAdmin(Admin admin ) {
		adminDao.saveAdmin(admin);
	}
	
	public boolean validateAdmin(String email ,String password) {
		return adminDao.validateAdmin(email, password) ;
	}
}

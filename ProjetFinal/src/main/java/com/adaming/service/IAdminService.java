package com.adaming.service;

import java.util.List;

import com.adaming.model.Admin;

public interface IAdminService {

	public Admin save(Admin admin);
	
	public Admin update(Admin admin);
	
	public void delete(Admin admin);
	
	public Admin findById(int numAdmin);
	
	public List<Admin> findAll();
	
}

package com.adaming.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IAdminDao;
import com.adaming.model.Admin;
import com.adaming.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService{

	
	@Autowired
	IAdminDao adminDao;
	
	
	
	public AdminServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminServiceImpl(IAdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}


	@Override
	public Admin save(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}

	@Override
	public Admin update(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.delete(admin);
	}

	@Override
	public Admin findById(int numAdmin) {
		// TODO Auto-generated method stub
		Optional<Admin> admin = adminDao.findById(numAdmin);
		return (admin == null ? null : admin.orElse(null));
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminDao.findAll();
	}

}

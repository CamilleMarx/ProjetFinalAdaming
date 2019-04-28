package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.model.Admin;
import com.adaming.service.IAdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	
	@PostMapping(value = "/ajoutAnim", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Admin save(@RequestBody Admin admin) {
			return this.adminService.save(admin);
		}
	
	
	@PutMapping(value = "/{idAdmin}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Admin update(@RequestBody Admin admin, @PathVariable int idAdmin) {
		if (adminService.findById(idAdmin) == null) {
			return null;
		}
		else {
			return adminService.save(admin);
		}	
	}
	
	@DeleteMapping(value = "/{idAdmin}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int idAdmin) {
		if (adminService.findById(idAdmin) != null) {
			adminService.delete(adminService.findById(idAdmin));
		}
	}
	
	@GetMapping(value = "/{idAdmin}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Admin findById(@PathVariable int idAdmin) {
		return adminService.findById(idAdmin);
	}
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Admin> findAll() {
		return adminService.findAll();
	}

}

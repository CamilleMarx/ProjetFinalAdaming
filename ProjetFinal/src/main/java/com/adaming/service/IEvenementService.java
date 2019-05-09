package com.adaming.service;

import java.util.List;

import com.adaming.model.Admin;
import com.adaming.model.Evenement;


public interface IEvenementService {
	
public Evenement save(Evenement evenement);
	
	public Evenement update(Evenement evenement);
	
	public void delete(Evenement evenement);
	
	public Evenement findById(int idEvent);
	
	public List<Evenement> findAll();
	

}

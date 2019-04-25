package com.adaming.service;

import java.util.List;

import com.adaming.model.Adherent;


public interface IAdherentService {

public Adherent save(Adherent adherent);
	
	public Adherent update(Adherent adherent);
	
	public void delete(Adherent adherent);
	
	public Adherent findById(int idAd);
	
	public List<Adherent> findAll();
	
}

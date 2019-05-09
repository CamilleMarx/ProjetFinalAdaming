package com.adaming.service;

import java.util.List;

import com.adaming.model.Adherent;
import com.adaming.model.FicheAnimal;


public interface IFicheAnimalService {
	

	public FicheAnimal save(FicheAnimal ficheAnimal);
	
	public FicheAnimal update(FicheAnimal ficheAnimal);
	
	public void delete(FicheAnimal ficheAnimal);
	
	public FicheAnimal findById(int idAnim);
	
	public List<FicheAnimal> findAll();
	
	public List<FicheAnimal> findByAdherent(Adherent adherent);

}


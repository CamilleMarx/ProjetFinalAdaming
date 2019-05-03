package com.adaming.service;

import java.util.List;

import com.adaming.model.FicheAnimal;


public interface IFicheAnimalService {
	

	public FicheAnimal save(FicheAnimal ficheAnimal);
	
	public FicheAnimal update(FicheAnimal ficheAnimal);
	
	public void delete(FicheAnimal ficheAnimal);
	
	public FicheAnimal findById(int idAnim);
	
	public List<FicheAnimal> findAll();

	public List<FicheAnimal> findByRaceNName(String race, String name);

	public List<FicheAnimal> findByRaceAndSexeAndLieuPrefere(String race, boolean sexe, String lieuPrefere);

	public List<FicheAnimal> findByRaceAndSexe(String race, boolean sexe);

}


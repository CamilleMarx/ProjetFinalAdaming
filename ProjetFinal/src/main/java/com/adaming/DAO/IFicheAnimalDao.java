package com.adaming.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.model.FicheAnimal;

@Repository
public interface IFicheAnimalDao extends JpaRepository<FicheAnimal, Integer>{

public List<FicheAnimal> findByRaceAndNomAnim(String race, String nomAnim);

public List<FicheAnimal> findByRaceAndSexeAndLieuPrefere(String race, boolean sexe, String lieuPrefere);

public List<FicheAnimal> findByRaceAndSexe(String race, boolean sexe);

	
	

}

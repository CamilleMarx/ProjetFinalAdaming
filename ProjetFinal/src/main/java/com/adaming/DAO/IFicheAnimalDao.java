package com.adaming.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adaming.model.Adherent;
import com.adaming.model.FicheAnimal;

@Repository
public interface IFicheAnimalDao extends JpaRepository<FicheAnimal, Integer>{
	
/** Méthode permettant de récupérer toutes les fiches animal correspondant à un adhérent
	@Param adherent
	@Return List<FicheAnimal> **/
public List<FicheAnimal> findByAdherent(Adherent adherent);

	
	

}

package com.adaming.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.model.FicheAnimal;

@Repository
public interface IFicheAnimalDao extends JpaRepository<FicheAnimal, Integer>{


	
	

}

package com.adaming.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.model.Adherent;


@Repository
public interface IAdherentDao extends JpaRepository<Adherent, Integer>{

	
	
}

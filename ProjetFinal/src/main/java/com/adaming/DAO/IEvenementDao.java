package com.adaming.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.model.Admin;
import com.adaming.model.Evenement;


@Repository
public interface IEvenementDao extends JpaRepository<Evenement, Integer>{


}

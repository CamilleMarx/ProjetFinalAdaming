package com.adaming.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.model.Admin;


@Repository
public interface IAdminDao extends JpaRepository<Admin, Integer>{

}

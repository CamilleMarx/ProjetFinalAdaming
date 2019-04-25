package com.adaming.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@DiscriminatorValue("Admin")
@Entity
public class Admin extends Adherent{

	
	private int numAdmin;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="admin", fetch=FetchType.LAZY)
	List<FicheAnimal> fichesAnimal = new ArrayList<FicheAnimal>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="admin", fetch=FetchType.LAZY)
	List<Evenement> evenement = new ArrayList<Evenement>();

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int numAdmin) {
		super();
		this.numAdmin = numAdmin;
	}

	public int getNumAdmin() {
		return numAdmin;
	}

	public void setNumAdmin(int numAdmin) {
		this.numAdmin = numAdmin;
	}
	
	
}

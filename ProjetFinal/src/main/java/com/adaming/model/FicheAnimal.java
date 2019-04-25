package com.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FicheAnimal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAnim;
	
	private String nomAnim;
	
	private String race;
	
	private boolean sexe;
	
	private int age;
	
	private String personnalite;
	
	private String humeur;
	
	private String temperament;
	
	private String lieuPrefere;

	public FicheAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FicheAnimal(int idAnim, String nomAnim, String race, boolean sexe, int age, String personnalite,
			String humeur, String temperament, String lieuPrefere) {
		super();
		this.idAnim = idAnim;
		this.nomAnim = nomAnim;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
		this.personnalite = personnalite;
		this.humeur = humeur;
		this.temperament = temperament;
		this.lieuPrefere = lieuPrefere;
	}

	public int getIdAnim() {
		return idAnim;
	}

	public void setIdAnim(int idAnim) {
		this.idAnim = idAnim;
	}

	public String getNomAnim() {
		return nomAnim;
	}

	public void setNomAnim(String nomAnim) {
		this.nomAnim = nomAnim;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPersonnalite() {
		return personnalite;
	}

	public void setPersonnalite(String personnalite) {
		this.personnalite = personnalite;
	}

	public String getHumeur() {
		return humeur;
	}

	public void setHumeur(String humeur) {
		this.humeur = humeur;
	}

	public String getTemperament() {
		return temperament;
	}

	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}

	public String getLieuPrefere() {
		return lieuPrefere;
	}

	public void setLieuPrefere(String lieuPrefere) {
		this.lieuPrefere = lieuPrefere;
	}
	
	

}
package com.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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
	
	private String description;
	
	private String lieuPrefere;
	
	@ManyToOne
	@JoinColumn(name="idAd")
	private Adherent adherent;
	
	@ManyToOne
	@JoinColumn(name="numAdmin")
	private Admin admin;

	public FicheAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FicheAnimal(int idAnim, String nomAnim, String race, boolean sexe, int age, String personnalite,
			String humeur, String description, String lieuPrefere) {
		super();
		this.idAnim = idAnim;
		this.nomAnim = nomAnim;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
		this.personnalite = personnalite;
		this.humeur = humeur;
		this.description = description;
		this.lieuPrefere = lieuPrefere;
	}
	
	

	public FicheAnimal(int idAnim, String nomAnim, String race, boolean sexe, int age, String personnalite,
			String humeur, String description, String lieuPrefere, Adherent adherent, Admin admin) {
		super();
		this.idAnim = idAnim;
		this.nomAnim = nomAnim;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
		this.personnalite = personnalite;
		this.humeur = humeur;
		this.description = description;
		this.lieuPrefere = lieuPrefere;
		this.adherent = adherent;
		this.admin = admin;
	}

	public FicheAnimal(int idAnim, String nomAnim, String race, boolean sexe, int age) {
		super();
		this.idAnim = idAnim;
		this.nomAnim = nomAnim;
		this.race = race;
		this.sexe = sexe;
		this.age = age;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLieuPrefere() {
		return lieuPrefere;
	}

	public void setLieuPrefere(String lieuPrefere) {
		this.lieuPrefere = lieuPrefere;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	

}

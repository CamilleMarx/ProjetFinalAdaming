package com.adaming.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_utilisateur", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Adherent")
@Entity
public class Adherent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAd;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String ville;
	
	private int cp;
	
	private int age;
	
	private String email;
	
	private String pseudonyme;
	
	private String mdp;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="AD_EVENT", joinColumns=@JoinColumn(name="idAd", referencedColumnName="idAd"), 
	inverseJoinColumns=@JoinColumn(name="idEvent", referencedColumnName="idEvent"))
	List<Evenement> evenements = new ArrayList<Evenement>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="adherent", fetch=FetchType.LAZY)
	List<FicheAnimal> fichesAnimal = new ArrayList<FicheAnimal>();

	public Adherent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adherent(int idAd, String nom, String prenom, String adresse, String ville, int cp, int age, String email,
			String pseudonyme, String mdp) {
		super();
		this.idAd = idAd;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.age = age;
		this.email = email;
		this.pseudonyme = pseudonyme;
		this.mdp = mdp;
	}

	
	public int getIdAd() {
		return idAd;
	}


	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}

	
	
	

}

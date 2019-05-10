package com.adaming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Evenement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEvent;
	
	private String nomEvent;
	
	private Date dateDeb;
	
	private Date dateFin;
	
	private String lieu;
	
	@ManyToMany(mappedBy="evenements")
	private List<Adherent> adherent = new ArrayList<Adherent>();
	
	@ManyToOne
	@JoinColumn(name="numAdmin")
	private Admin admin;
	
	
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evenement(int idEvent, String nomEvent, Date dateDeb, Date dateFin, String lieu) {
		super();
		this.idEvent = idEvent;
		this.nomEvent = nomEvent;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.lieu = lieu;
	}

	
	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getNomEvent() {
		return nomEvent;
	}

	public void setNomEvent(String nomEvent) {
		this.nomEvent = nomEvent;
	}

	public Date getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	
	
	

}

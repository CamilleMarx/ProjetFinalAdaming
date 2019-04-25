package com.adaming.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IAdherentDao;
import com.adaming.model.Adherent;
import com.adaming.service.IAdherentService;

@Service
public class AdherentServiceImpl implements IAdherentService{

	@Autowired
	IAdherentDao adherentdao;
	
	
	public AdherentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub	
	}

	public AdherentServiceImpl(IAdherentDao adherentdao) {
		super();
		this.adherentdao = adherentdao;
	}
	

	@Override
	public Adherent save(Adherent adherent) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Adherent update(Adherent adherent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Adherent adherent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Adherent findById(int idAd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adherent> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

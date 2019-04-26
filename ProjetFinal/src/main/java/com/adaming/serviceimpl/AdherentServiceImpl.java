package com.adaming.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IAdherentDao;
import com.adaming.model.Adherent;
import com.adaming.service.IAdherentService;

@Service
public class AdherentServiceImpl implements IAdherentService{

	@Autowired
	IAdherentDao adherentDao;
	
	
	public AdherentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub	
	}

	public AdherentServiceImpl(IAdherentDao adherentDao) {
		super();
		this.adherentDao = adherentDao;
	}
	

	@Override
	public Adherent save(Adherent adherent) {
		// TODO Auto-generated method stub
		
		return adherentDao.save(adherent);
	}

	@Override
	public Adherent update(Adherent adherent) {
		// TODO Auto-generated method stub
		return adherentDao.save(adherent);
	}

	@Override
	public void delete(Adherent adherent) {
		// TODO Auto-generated method stub
		adherentDao.delete(adherent);
		
	}

	@Override
	public Adherent findById(int idAd) {
		// TODO Auto-generated method stub
		Optional<Adherent> adherent = adherentDao.findById(idAd);
		return (adherent == null ? null : adherent.orElse(null));
	}

	@Override
	public List<Adherent> findAll() {
		// TODO Auto-generated method stub
		return adherentDao.findAll();
	}

}

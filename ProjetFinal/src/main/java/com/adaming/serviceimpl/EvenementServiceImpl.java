package com.adaming.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IEvenementDao;
import com.adaming.model.Evenement;
import com.adaming.service.IEvenementService;

@Service
public class EvenementServiceImpl implements IEvenementService{

	
	@Autowired
	IEvenementDao evenementDao;
	
	
	public EvenementServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EvenementServiceImpl(IEvenementDao evenementDao) {
		super();
		this.evenementDao = evenementDao;
	}

	@Override
	public Evenement save(Evenement evenement) {
		// TODO Auto-generated method stub
		return evenementDao.save(evenement);
	}

	@Override
	public Evenement update(Evenement evenement) {
		// TODO Auto-generated method stub
		return evenementDao.save(evenement);
	}

	@Override
	public void delete(Evenement evenement) {
		// TODO Auto-generated method stub
		evenementDao.delete(evenement);
	}

	@Override
	public Evenement findById(int idEvent) {
		// TODO Auto-generated method stub
		Optional<Evenement> evenement = evenementDao.findById(idEvent);
		return (evenement == null ? null : evenement.orElse(null));
	}

	@Override
	public List<Evenement> findAll() {
		// TODO Auto-generated method stub
		return evenementDao.findAll();
	}

}

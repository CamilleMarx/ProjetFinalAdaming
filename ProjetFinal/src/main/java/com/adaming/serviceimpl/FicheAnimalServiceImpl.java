package com.adaming.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IFicheAnimalDao;
import com.adaming.model.FicheAnimal;
import com.adaming.service.IFicheAnimalService;

@Service
public class FicheAnimalServiceImpl implements IFicheAnimalService{

	@Autowired
	IFicheAnimalDao ficheAnimalDao;
	
	
	public FicheAnimalServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public FicheAnimalServiceImpl(IFicheAnimalDao ficheAnimalDao) {
		super();
		this.ficheAnimalDao = ficheAnimalDao;
	}



	@Override
    public FicheAnimal save(FicheAnimal ficheAnimal) {
        // TODO Auto-generated method stub
        return  ficheAnimalDao.save(ficheAnimal);
    }



    @Override
    public FicheAnimal update(FicheAnimal ficheAnimal) {
        // TODO Auto-generated method stub
        return  ficheAnimalDao.save(ficheAnimal);
    }



    @Override
    public void delete(FicheAnimal ficheAnimal) {
        // TODO Auto-generated method stub
    	 ficheAnimalDao.delete(ficheAnimal);
    }



    @Override
    public FicheAnimal findById(int idAnim) {
    	Optional<FicheAnimal> ficheAnimal = ficheAnimalDao.findById(idAnim);
        return  (ficheAnimal == null ? null : ficheAnimal.orElse(null));
       
    }



    @Override
    public List<FicheAnimal> findAll() {
        // TODO Auto-generated method stub
    	return  ficheAnimalDao.findAll();
    }



	@Override
	public List<FicheAnimal> findByRaceNName(String race, String name) {
		return this.ficheAnimalDao.findByRaceAndNomAnim(race, name);
	}

	@Override
	public List<FicheAnimal> findByRaceAndSexeAndLieuPrefere(String race, boolean sexe, String lieuPrefere) {
		return this.ficheAnimalDao.findByRaceAndSexeAndLieuPrefere(race, sexe, lieuPrefere);
	}

	@Override
	public List<FicheAnimal> findByRaceAndSexe(String race, boolean sexe) {
		return this.ficheAnimalDao.findByRaceAndSexe(race, sexe);
	}

}




	
	



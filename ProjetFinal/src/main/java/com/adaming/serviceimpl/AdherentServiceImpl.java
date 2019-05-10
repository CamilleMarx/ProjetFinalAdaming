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
	/**Methode permettant de sauvegarder un objet Adherent
	 * 
	 * @param Adherent
	 * @return save de adherentDao
	 */
	public Adherent save(Adherent adherent) {
		// TODO Auto-generated method stub
		
		return adherentDao.save(adherent);
	}

	@Override
	/**Methode permettant de modifier un objet Adherent
	 * 
	 * @param Adherent
	 * @return save de adherentDao
	 */
	public Adherent update(Adherent adherent) {
		// TODO Auto-generated method stub
		return adherentDao.save(adherent);
	}

	@Override
	/**Methode permettant de supprimer un objet Adherent
	 * 
	 * @param Adherent
	 */
	public void delete(Adherent adherent) {
		// TODO Auto-generated method stub
		adherentDao.delete(adherent);
		
	}

	@Override
	/**Methode permettant de récupérer un objet Adherent suivant son id
	 * 
	 * @paramidAd
	 * @return findById de adherentDao
	 */
	public Adherent findById(int idAd) {
		// TODO Auto-generated method stub
		Optional<Adherent> adherent = adherentDao.findById(idAd);
		return (adherent == null ? null : adherent.orElse(null));
	}

	@Override
	/**Methode permettant d'afficher tous les objets adherent
	 * 
	 * @return findAll de adherentDao
	 */
	public List<Adherent> findAll() {
		// TODO Auto-generated method stub
		return adherentDao.findAll();
	}

}

package com.adaming.service;

import java.util.List;

import com.adaming.model.Admin;
import com.adaming.model.Evenement;


public interface IEvenementService {
	
	/**Methode permettant de sauvegarder un objet Evenement
	 * 
	 * @param Evenement
	 * @return Evenement
	 */
    public Evenement save(Evenement evenement);
	
    /**Methode permettant de mettre à jour un objet Evenement
	 * 
	 * @param Evenement
	 * @return Evenement
	 */
	public Evenement update(Evenement evenement);
	
	/**Methode permettant de supprimer un objet Evenement
	 * 
	 * @param Evenement
	 */
	public void delete(Evenement evenement);
	
	/**Methode permettant de récupérer un objet Evenement
	 * 
	 * @param identfiant de l'evenement
	 * @return Evenement
	 */
	public Evenement findById(int idEvent);
	
	/**Methode permettant d'afficher tous les objets Evenement
	 * 
	 * @return List<Evenement> 
	 */
	public List<Evenement> findAll();
	

}

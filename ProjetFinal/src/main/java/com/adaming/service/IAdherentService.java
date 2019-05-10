package com.adaming.service;

import java.util.List;

import com.adaming.model.Adherent;


public interface IAdherentService {

	/**Methode permettant de sauvegarder un objet Adherent
	 * 
	 * @param Adherent
	 * @return Adherent
	 */
    public Adherent save(Adherent adherent);
	
    /**Methode permettant de mettre à jour un objet Adherent
	 * 
	 * @param Adherent
	 * @return Adherent
	 */
	public Adherent update(Adherent adherent);
	
	/**Methode permettant de supprimer un objet Adherent
	 * 
	 * @param Adherent
	 */
	public void delete(Adherent adherent);
	
	/**Methode permettant de récupérer un objet Adherent
	 * 
	 * @param identfiant de l'adhérent
	 * @return Adherent
	 */
	public Adherent findById(int idAd);
	
	/**Methode permettant d'afficher tous les objets Adherent
	 * 
	 * @return List<Adhérent> 
	 */
	public List<Adherent> findAll();
	
}

package com.adaming.service;

import java.util.List;

import com.adaming.model.Adherent;
import com.adaming.model.FicheAnimal;


public interface IFicheAnimalService {
	
	/**Methode permettant de sauvegarder un objet FicheAnimal
	 * 
	 * @param FicheAnimal
	 * @return FicheAnimal
	 */
	public FicheAnimal save(FicheAnimal ficheAnimal);
	
	/**Methode permettant de mettre à jour un objet FicheAnimal
	 * 
	 * @param FicheAnimal
	 * @return FicheAnimal
	 */
	public FicheAnimal update(FicheAnimal ficheAnimal);
	
	/**Methode permettant de supprimer un objet FicheAnimal
	 * 
	 * @param FicheAnimal
	 */
	public void delete(FicheAnimal ficheAnimal);
	
	/**Methode permettant de récupérer un objet FicheAnimal
	 * 
	 * @param identfiant de la ficheAnimal
	 * @return FicheAnimal
	 */
	public FicheAnimal findById(int idAnim);
	
	/**Methode permettant d'afficher tous les objets FicheAnimal
	 * 
	 * @return List<Adhérent> 
	 */
	public List<FicheAnimal> findAll();
	
	/**Methode permettant de récupérer tous les objets FicheAnimal correspondant à un adhérent particulier
	 * 
	 * @param Adherent
	 * @return List<FicheAnimal>
	 */
	public List<FicheAnimal> findByAdherent(Adherent adherent);

}


package com.adaming.service;

import java.util.List;

import com.adaming.model.Admin;

public interface IAdminService {

	/**Methode permettant de sauvegarder un objet Admin
	 * 
	 * @param Admin
	 * @return Admin
	 */
	public Admin save(Admin admin);
	
	/**Methode permettant de mettre à jour un objet Admin
	 * 
	 * @param Admin
	 * @return Admin
	 */
	public Admin update(Admin admin);
	
	/**Methode permettant de supprimer un objet Admin
	 * 
	 * @param Admin
	 */
	public void delete(Admin admin);
	
	/**Methode permettant de mettre à jour un objet Admin
	 * 
	 * @param identfiant de l'admin
	 * @return Admin
	 */
	public Admin findById(int numAdmin);
	
	/**Methode permettant d'afficher tous les objets Admin
	 * 
	 * @return List<Admin> 
	 */
	public List<Admin> findAll();
	
}

package fr.gtm.bovoyage.dao;

import fr.gtm.bovoyage.entities.Voyage;

	/** 
	 * 
	 * @author JC et Zainab 
	 * @version 1.0
	 * 
	 */

public interface VoyageDAO {

	/** 
	 *
     * Signature de methode :  
     * sert a creer un voyage.
     *  @param v :
     *  Le parametre v correspond a l'objet Voyage correspondant a la destination recherchee @see Voyage
     */
	public void create(Voyage v);

	
	
	
	/** 
     * Signature de methode :  
     * sert a supprimer un voyage.
     *  @param v :
     *  Le parametre v correspond a l'objet Voyage correspondant a la destination recherchee @see Voyage
     */	
	public void delete(Voyage v);
	
	
	
	/** 
     * Signature de methode :  
     * sert a mettre a jour un voyage.
     * @param v :
     * Le parametre v correspond a l'objet Voyage correspondant a la destination recherchee @see Voyage
     */	
	public void update(Voyage v);
	
	
	
	
	/** 
     * Signature de methode :  
     * sert a recuperer un voyage a partir 
     * de son identifiant.
     * @param id :
     * Le parametre id definit l'identifiant du voyage correspondant a la destination recherchee @see Voyage
     * @return Voyage :
     * Retourne un objet Voyage qui correspond a l'id qui est en parametre.
     */
	public Voyage getVoyageById(long id);
	

}

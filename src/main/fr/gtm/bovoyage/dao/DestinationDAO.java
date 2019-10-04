
package fr.gtm.bovoyage.dao;

import java.util.List;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

/** 
 * 
 * @author Zainab et JC
 * @version 1.0
 */
public interface DestinationDAO {

	/** 
     * Signature de la methode qui 
     * sert a creer une destination.  
     * @param d
     * Le parametre d correspond a l'objet Destination
     */
	public void create(Destination d);
	
	/** 
     * Signature de la methode qui 
     * sert a supprimer une destination.  
     * @param d
     * Le parametre d correspond a l'objet Destination
     */
	public void delete(Destination d);
	
	/** 
     * Signature de la methode qui 
     * sert a mettre a jour une destination.
     * @param d
     * Le parametre d correspond a l'objet Destination  
     */
	public void update(Destination d);
	
	/** 
     * Signature de la methode qui 
     * sert a recuperer toutes les destinations 
     * pour une region donnee.
     * @param region
     * Le parametre region permet de definir le nom de la region recherchee.
     * @return 
     * Renvoie une liste contenant toutes les Destination ayant pour region le nom de region recherchee.
     */
	public List<Destination> getDestinationByRegion(String region);
	
	/** 
     * Signature de la methode qui 
     * sert a recuparer une destination
     * par son numero identifiant. 
     * @param id
     * Le parametre id permet de definir l'id de la destination recherchee.
     * @return 
     * Renvoie l'objet Destination correspondant a l'id passe en parametre.
     */
	public Destination destinationById(long id);
	
	/** 
     * Signature de la methode qui 
     * sert a recuperer la liste des dates
     * de voyage disponibles pour une destination
     * donnee.  
     * @param d
     * Le parametre d correspond a l'objet Destination  
     * @return  
     * Renvoie la liste des dates de voyages associees a la destination d.
     */
	public List<DatesVoyage> getDatesVoyages(Destination d);
	
	/** 
     * Signature de la methode qui 
     * sert a recuperer une liste contenant
     * toutes les destinations.  
     * @return  
     * Renvoie la liste de toutes les destinations presentes dans le MOCK.
     */
	public List<Destination> getAllDestinations();
	
}

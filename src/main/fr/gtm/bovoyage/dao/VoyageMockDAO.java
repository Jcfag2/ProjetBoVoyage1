package fr.gtm.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.bovoyage.entities.Voyage;

/** 
 * 
 * @author JC et Zainab 
 * @version 1.0
 * 
 */



	/** 
	 * Methode qui permet de creer un voyage dans le Mock. 
	 */

public class VoyageMockDAO implements VoyageDAO {
	
	
	
	/** 
	 *  Creation d'une liste de voyages 
     */
	private List <Voyage> voyages = new ArrayList<Voyage>();
	
	
	/** 
	 *  Simulation du compteur. Modificateur static car s'il existe plusieurs VoyageDAO instancies, il leur faudra le meme compteur !! 
     */
	public static long idCpt = 0; 
	
	
	
	/** 
     * Methode creer :  
     * sert a creer un voyage en lui attribuant un identifiant, puis incrementation du compteur pour ajouter le voyage cree, a la liste de voyages.
     * 
     * @param v :
     * Le parametre v correspond a l'objet voyage correspondant a la destination recherchee @see Voyage
     * 
     */
	@Override
	public void create(Voyage v) {
		v.setId(++idCpt);
		voyages.add(v);
	}
	
	
	

	/** 
     * Methode supprimer :  
     * sert a supprimer un voyage de la liste en supprimant son identifiant.
     * 
     * @param v :
     * Le parametre v correspond a l'objet voyage correspondant a la destination recherchee @see Voyage
     * 
     */	
	@Override
	public void delete(Voyage v) {
		voyages.remove(v);
		v.setId(0);
	}

	
	
	
	/** 
     * Methode de mise a jour :  
     * sert a mettre a jour un voyage de la liste en lui attribuant un nouvel identifiant.
     * 
     * @param v :
     * Le parametre v correspond a l'objet voyage correspondant a la destination recherchee @see Voyage
     * 
     */	
	@Override
	public void update(Voyage v) {
		for (Voyage voyage : voyages) {
			if (voyage.getId() == v.getId()); {
			
			}
		}
	}
	
	
	
	
	/** 
     * Methode :  
     * sert a recuperer un voyage a partir de son identifiant.
     * @param id :
     * Le parametre id definit l'identifiant du voyage correspondant a la destination recherchee @see Voyage
     * @return Voyage :
     * Retourne un objet Voyage qui correspond a l'id qui est en parametre.
     * Ou ne retourne aucun voyage si l'id ne correspond pas.
     */

	@Override
	public Voyage getVoyageById(long id) {
		for(Voyage voyage : voyages) {
			if(voyage.getId() == id)
				return voyage;
	}
		return null;
//
	}
}

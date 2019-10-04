package fr.gtm.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

/** 
 * 
 * @author Zainab et JC
 * @version 1.0
 */
public class DestinationMockDAO implements DestinationDAO {
	private List<Destination> destinations = new ArrayList<Destination>();	//Création d'une liste de destinations
	private static long idCpt = 0;		//Simulation du compteur

	/** 
     * Methode permettant de creer une nouvelle destination dans le MOCK.
     * @param d
     * Le parametre d correspond a l'objet Destination
     */
	@Override
	public void create(Destination d) {

		d.setId(++idCpt); 	//On attribue un id a une destination donnée, puis on incrémente l'id à l'aide du compteur.
		destinations.add(d);	//On ajoute la destination d recherchée à la liste de destinations.

	}
	
	/** 
     * Methode permettant de supprimer destination dans le MOCK.
     * @param d
     * Le parametre d correspond a l'objet Destination
     */
	@Override
	public void delete(Destination d) {
		destinations.remove(d);	//On supprime la destination d de la liste des destinations.
		d.setId(0);				//On met à zéro l'id de la destination d.
	}
	
	/** 
     * Methode permettant de mettre à jour destination dans le MOCK.
     * @param d
     * Le parametre d correspond a l'objet Destination
     */
	@Override
	public void update(Destination d) {
		for (Destination destination : destinations) {	//boucle for-each pour chaque destination
			if (d.getId() == destination.getId()) {		//si l'id de la destination du Mock correspond à l'id que l'on veut modifier,
				destination.setRegion(d.getRegion());	//MàJ de la région.
				destination.setDescriptif(d.getDescriptif());   //MàJ du descriptif.
				destination.setImage(d.getImage());				//MàJ de l'image
				destination.setDates(d.getDates());				//MàJ de la date.
			}
		}
	}

	/** 
     * Methode permettant de recuperer une liste de destination vers une meme region depuis le MOCK.
     * @param region
     * Le parametre region de type string permet de definir le critere de selection.
     * @return 
     * Renvoie une liste contenant toutes les Destination ayant pour region le nom de region recherchee.
     */
	@Override
	public List<Destination> getDestinationByRegion(String region) {	
		List<Destination> destinationsByRegion = new ArrayList<Destination>();	//Création de la liste des destinations en fonction de la région choisie.

		for (Destination destination : destinations) {	//Boucle for-each pour chaque destination
			if (destination.getRegion() == region)	//Si la région de la destination du Mock correspond à la region de la destination recherchée
				destinationsByRegion.add(destination);	//On ajoute la destination correspondant à la région recherchée dans la liste des destinationByRegion
		}
		return destinationsByRegion;		//Retour de la destination qui correspond à la région

	}

	/** 
     * Methode permettant de recuperer une destination par son identifiant depuis le MOCK.
     * @param id
     * Le parametre id de type int permet de definir le critere de selection.
     * @return 
     * Renvoie l'objet Destination correspondant a l'id passe en parametre.
     */
	@Override
	public Destination destinationById(long id) {	
		for (Destination destination : destinations) {	//Boucle for-each pour chaque destination
			if (destination.getId() == id)				//Si l'id de la destination du Mock correspond à l'id de la destination recherchée.
				return destination;						//Retour de la destination qui correspond à l'id.
		}
		return null;							//Si l'id ne correspond à aucune destination, alors ne retourne rien.
	}

	/** 
     * Methode permettant d'obtenir la liste des dates de voyage associees a une destination dans le MOCK.
     * @param d
     * Le parametre d correspond a l'objet Destination
      * @return  
     * Renvoie la liste des dates de voyages associees a la destination d.
     */
	@Override
	public List<DatesVoyage> getDatesVoyages(Destination d) {	
		return d.getDates();										//Retour des dates pour la destination d.
	}

	/** 
     * Methode permettant d'obtenir la liste de toutes les destination contenues dans le MOCK.
     * @return  
     * Renvoie la liste de toutes les destinations presentes dans le MOCK.
     */
	@Override
	public List<Destination> getAllDestinations() {
		return destinations;										//Retour de toutes les destinations.
	}

}

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
	private List<Destination> destinations = new ArrayList<Destination>();
	private static long idCpt = 0;

	/**
	 * Methode permettant de creer une nouvelle destination dans le MOCK.
	 * 
	 * @param d Le parametre d correspond a l'objet Destination
	 */
	@Override
	public void create(Destination d) {

		d.setId(++idCpt);
		destinations.add(d);

	}

	/**
	 * Methode permettant de supprimer destination dans le MOCK.
	 * 
	 * @param d Le parametre d correspond a l'objet Destination
	 */
	@Override
	public void delete(Destination d) {
		destinations.remove(d);
		d.setId(0);
	}

	/**
	 * Methode permettant de mettre à jour destination dans le MOCK.
	 * 
	 * @param d Le parametre d correspond a l'objet Destination
	 */
	@Override
	public void update(Destination d) {
		for (Destination destination : destinations) {
			if (d.getId() == destination.getId()) {
				destination.setRegion(d.getRegion());
				destination.setDescriptif(d.getDescriptif());
				destination.setImage(d.getImage());
				destination.setDates(d.getDates());
			}
		}
	}

	/**
	 * Methode permettant de recuperer une liste de destination vers une meme region
	 * depuis le MOCK.
	 * 
	 * @param region Le parametre region de type string permet de definir le critere
	 *               de selection.
	 * @return Renvoie une liste contenant toutes les Destination ayant pour region
	 *         le nom de region recherchee.
	 */
	@Override
	public List<Destination> getDestinationByRegion(String region) {
		List<Destination> destinationsByRegion = new ArrayList<Destination>();

		for (Destination destination : destinations) {
			if (destination.getRegion() == region)
				destinationsByRegion.add(destination);
		}
		return destinationsByRegion;

	}

	/**
	 * Methode permettant de recuperer une destination par son identifiant depuis le
	 * MOCK.
	 * 
	 * @param id Le parametre id de type int permet de definir le critere de
	 *           selection.
	 * @return Renvoie l'objet Destination correspondant a l'id passe en parametre.
	 */
	@Override
	public Destination destinationById(long id) {
		for (Destination destination : destinations) {
			if (destination.getId() == id)
				return destination;
		}
		return null;
	}

	/**
	 * Methode permettant d'obtenir la liste des dates de voyage associees a une
	 * destination dans le MOCK.
	 * 
	 * @param d Le parametre d correspond a l'objet Destination
	 * @return Renvoie la liste des dates de voyages associees a la destination d.
	 */
	@Override
	public List<DatesVoyage> getDatesVoyages(Destination d) {
		return d.getDates();
	}

	/**
	 * Methode permettant d'obtenir la liste de toutes les destination contenues
	 * dans le MOCK.
	 * 
	 * @return Renvoie la liste de toutes les destinations presentes dans le MOCK.
	 */
	@Override
	public List<Destination> getAllDestinations() {
		return destinations;
	}

}

package fr.gtm.bovoyage.facade;

import java.util.List;

import fr.gtm.bovoyage.dao.DestinationDAO;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

//
public class DestinationFacade {

	private DestinationDAO dao; // lien vers le dao.

	public DestinationFacade(DestinationDAO dao) {
		this.dao = dao;
	}

	public void create(Destination d) {
		dao.create(d);

	}

	public List<Destination> getAllDestinations() {
		return dao.getAllDestinations();
	}

	public List<DatesVoyage> getDatesVoyages(Destination d) {
		return dao.getDatesVoyages(d);
	}

	public List<Destination> getDestinationByRegion(String region) {
		return dao.getDestinationByRegion(region);
	}

	public List<DatesVoyage> getDatesVoyages(long idDestination) {

		List<Destination> destinations = dao.getAllDestinations();	//Creation d'une liste de destinations qui recupere toutes les destinations du MOCK.

		for (Destination destination : destinations) {		//Boucle for-each pour chaque destination
		if (destination.getId() == idDestination)			//Si l'id de la destination dans le MOCK correspond à l'id recherché.
				return dao.getDatesVoyages(destination);	//Retour de la date de la destination.

		}
		return null;										//Si l'id recherché n'existe pas dans le MOCK, ne retourne rien.
	}
}

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

		List<Destination> destinations = dao.getAllDestinations();

		for (Destination destination : destinations) {
			if (destination.getId() == idDestination)
				return dao.getDatesVoyages(destination);

		}
		return null;
	}
}

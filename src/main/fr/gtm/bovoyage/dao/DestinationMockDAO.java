package fr.gtm.bovoyage.dao;

import java.util.List;

import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

public class DestinationMockDAO implements DestinationDAO {

	@Override
	public void create(Destination d) {
	}

	@Override
	public void delete(Destination d) {
	}

	@Override
	public void update(Destination d) {
	}

	@Override
	public List<Destination> getDestinationByRegion(String region) {
		return null;
	}

	@Override
	public Destination destinationById(long id) {
		return null;
	}

	@Override
	public List<DatesVoyage> getDatesVoyages(Destination d) {
		return null;
	}

	@Override
	public List<Destination> getAllDestinations() {
		return null;
	}

}

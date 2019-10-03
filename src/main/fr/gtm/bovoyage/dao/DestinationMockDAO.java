package fr.gtm.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

public class DestinationMockDAO implements DestinationDAO {
	private List<Destination> destinations = new ArrayList<Destination>();
	private static long idCpt = 0;

	@Override
	public void create(Destination d) {
		d.setId(++idCpt);
		destinations.add(d);
	}

	@Override
	public void delete(Destination d) {
		destinations.remove(d);
		d.setId(0);
	}

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

	@Override
	public List<Destination> getDestinationByRegion(String region) {
		List<Destination> destinationsByRegion = new ArrayList<Destination>();

		for (Destination destination : destinations) {
			if (destination.getRegion() == region)
				destinationsByRegion.add(destination);
		}
		return destinationsByRegion;

	}

	@Override
	public Destination destinationById(long id) {
		for (Destination destination : destinations) {
			if (destination.getId() == id)
				return destination;
		}
		return null;
	}

	@Override
	public List<DatesVoyage> getDatesVoyages(Destination d) {
		return d.getDates();
	}

	@Override
	public List<Destination> getAllDestinations() {
		return destinations;
	}

}

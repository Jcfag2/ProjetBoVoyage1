
package fr.gtm.bovoyage.dao;

import java.util.List;

import fr.gtm.bovoyage.entities.Destination;

public interface DestinationDAO {

	public void create(Destination d);
	public void delete(Destination d);
	public void update(Destination d);
	public List<Destination> destinationByRegion(String region);
	public Destination destinationById(long id);
	public List<Destination> getDatesVoyage(Destination d);
	public List<Destination> getAllDestination();
}

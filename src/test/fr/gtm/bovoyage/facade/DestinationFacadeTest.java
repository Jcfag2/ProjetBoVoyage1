package fr.gtm.bovoyage.facade;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.bovoyage.dao.DestinationMockDAO;
import fr.gtm.bovoyage.entities.Destination;

public class DestinationFacadeTest {

	private Destination[] destinations = {
			new Destination("Maroc", "Il fait beau et chaud, et il y a beaucoup de sable"),
			new Destination("Islande", "Il fait froid et il y a beaucoup de neige"), new Destination("Le Caire",
					"Faites attention, c'est un véritable nid d'espion. Au fait, comment est votre blanquette ?") };

	private DestinationFacade facade = new DestinationFacade(new DestinationMockDAO());

	@Test
	public void testCreate() {
		Destination d = destinations[0];
		facade.create(d);
		int nb = facade.getAllDestinations().size();
		assertEquals(1, nb);
		assertNotEquals(0, d.getId());

	}

	@Test
	public void testGetAllDestinations() {
		for (Destination destination : destinations) {
			facade.create(destination);
		}
		assertEquals(destinations.length, facade.getAllDestinations().size());
	}

	@Test
	public void testGetDatesVoyagesDestination() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetDestinationByRegion() {
		String region = "Poitou";
		List<Destination> destinationsByRegionTest = new ArrayList<Destination>();

		for (Destination destination : destinations) {
			if (destination.getRegion() == region)
				destinationsByRegionTest.add(destination);
		}

		assertEquals(destinationsByRegionTest, facade.getDestinationByRegion(region));
	}

	@Test
	public void testGetDatesVoyagesById() {
		// fail("Not yet implemented");
	}

}

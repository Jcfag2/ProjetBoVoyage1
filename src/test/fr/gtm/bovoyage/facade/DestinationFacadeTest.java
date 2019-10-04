package fr.gtm.bovoyage.facade;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import fr.gtm.bovoyage.dao.DestinationMockDAO;
import fr.gtm.bovoyage.entities.DatesVoyage;
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
		Destination d = destinations[0];
		facade.create(d);
		Date d1 = new Date(2019, 5, 22);
		Date d2 = new Date(2019, 6, 21);
		Date d3 = new Date(2019, 7, 1);
		Date d4 = new Date(2019, 8, 2);
		DatesVoyage dates1 = new DatesVoyage(d1, d2, 0, 0);
		DatesVoyage dates2 = new DatesVoyage(d3, d4, 0, 0);
		DatesVoyage dates3 = new DatesVoyage(d1, d4, 0, 0);
		List<DatesVoyage> dates = new ArrayList<DatesVoyage>();
		dates.add(dates1);
		dates.add(dates2);
		dates.add(dates3);
		d.setDates(dates);

		assertEquals(d.getDates(), dates);

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
		Destination d = destinations[0];
		Destination dDeux = destinations[1];
		facade.create(d);
		facade.create(dDeux);
		Date d1 = new Date(2019, 5, 22);
		Date d2 = new Date(2019, 6, 21);
		Date d3 = new Date(2019, 7, 1);
		Date d4 = new Date(2019, 8, 2);
		Date d5 = new Date(2020, 8, 2);
		Date d6 = new Date(2020, 9, 4);
		DatesVoyage dates1 = new DatesVoyage(d1, d2, 0, 0);
		DatesVoyage dates2 = new DatesVoyage(d3, d4, 0, 0);
		DatesVoyage dates3 = new DatesVoyage(d1, d4, 0, 0);
		DatesVoyage dates4 = new DatesVoyage(d2, d3, 0, 0);
		DatesVoyage dates5 = new DatesVoyage(d5, d6, 0, 0);
		List<DatesVoyage> dates = new ArrayList<DatesVoyage>();
		List<DatesVoyage> datesDeux = new ArrayList<DatesVoyage>();
		dates.add(dates1);
		dates.add(dates2);
		dates.add(dates3);
		datesDeux.add(dates4);
		datesDeux.add(dates5);
		d.setDates(dates);
		dDeux.setDates(datesDeux);

		assertEquals(facade.getDatesVoyages(1), dates);
		assertEquals(facade.getDatesVoyages(2), datesDeux);
		assertNotEquals(facade.getDatesVoyages(2), dates);
		assertNotEquals(facade.getDatesVoyages(1), datesDeux);
	}

}

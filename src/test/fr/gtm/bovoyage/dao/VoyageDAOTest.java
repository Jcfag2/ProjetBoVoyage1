package fr.gtm.bovoyage.dao;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import fr.gtm.bovoyage.entities.Client;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Voyage;
import fr.gtm.bovoyage.entities.Voyageur;


public class VoyageDAOTest {
	
	Date d1 = new Date(2019,05,22);
	Date d2 = new Date(2019,06,22);
	Date d3 = new Date(1965,02,14);
	List<Voyageur> voyageurs = new List<Voyageur>();
	Voyageur v1 = new Voyageur("Mr", "Pignon", "François", d3, 1);
	Voyageur v2 = new Voyageur("Mr", "Skywalker", "Anakin", d3, 2);
	
	DatesVoyage date1 = new DatesVoyage(d1, d2, 0, 0);
	Client c1 = new Client("Charles", 123);
	
	private Voyage[] voyages = {
			new Voyage("Maroc", "Il fait chaud et il y a du sable", 123, date1, c1, voyageurs),
			new Voyage("Islande", "Il fait froid et il y a beaucoup de neige", 456, date1, c1, voyageurs)
			
			
			
	};
	private VoyageDAO dao = new VoyageMockDAO();

	@Test
	public void testCreate() {
		Voyage voyage = voyages[0];
		dao.create(voyage);
		int nb = voyages.length;
		assertEquals(1, nb);
		assertNotEquals(0, voyage.getId());
	}

	@Test
	public void testDelete() {
		Voyage voyage = voyages[0];
		dao.create(voyage);
		long id = voyage.getId();
		dao.delete(voyage);
		assertNull(dao.getVoyageById(id));
	}

	@Test
	public void testUpdate() {
		Voyage voyage = voyages[0];
		dao.create(voyage);
		voyage.setRegion("Berck-sur-mer");
		dao.update(voyage);
		Voyage voyage1= dao.getVoyageById(voyage.getId());
		assertEquals("voyage", voyage1.getRegion());
	}

	@Test
	public void testGetVoyageById() {
		Voyage voyage = voyages[0];
		dao.create(voyage);
		long id = voyage.getId();
		assertEquals(voyage, dao.getVoyageById(id));
	}

}

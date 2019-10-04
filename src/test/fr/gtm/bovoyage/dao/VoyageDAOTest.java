package fr.gtm.bovoyage.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
	List<Voyageur> voyageurs;
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
		
		List <Voyage> voyages = new ArrayList <Voyage>();
		Voyage v = new Voyage("Quebec", "Trop de neige", 789, date1, c1, voyageurs);
		Voyage vv = new Voyage("Marseille", "Il y a la plage et les montagnes", 159, date1, c1, voyageurs);
		Voyage vvv = new Voyage("Tatooïne", "I don't like sand, it's coarse and rough an irritating and it gets everywhere.", 357, date1, c1, voyageurs);
				
		for (Voyage voyage : voyages) {
			dao.create(voyage);	
		
		//Voyage.setId();
		voyages.add(v);
		voyages.add(vv);
		voyages.add(vvv);
		
		
		int nb = voyages.size();
		assertEquals(3, nb);
		assertNotEquals(4, nb);	
		
		}
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

		Voyage v = new Voyage("Quebec", "Trop de neige", 789, date1, c1, voyageurs);
		
			dao.create(v);	
			String region = "Poutineland";
			v.setRegion(region);	
			dao.update(v);	
			
		assertEquals(region, v.getRegion());
	
		
	}

	@Test
	public void testGetVoyageById() {
		Voyage voyage = voyages[0];
		dao.create(voyage);
		long id = voyage.getId();
		assertEquals(voyage, dao.getVoyageById(id));
	}

}

package fr.gtm.bovoyage.facade;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.bovoyage.dao.DestinationMockDAO;
import fr.gtm.bovoyage.entities.Destination;

public class DestinationFacadeTest {
	
	private Destination[] destinations = {
			new Destination("Maroc", "Il fait beau et chaud, et il y a beaucoup de sable"),
			new Destination("Islande", "Il fait froid et il y a beaucoup de neige"),
			new Destination("Le Caire", "Faites attention, c'est un véritable nid d'espion. Au fait, comment est votre blanquette ?")
	};
	private DestinationFacade facade = new DestinationFacade(new DestinationMockDAO());
	
	@Test
	public void testCreate() {
		Destination d = destinations[0];
		facade.create(d);
		int nb = facade.getAllDestinations().size();
		assertEquals(1, nb);
		assertNotEquals(0, d.getId());
		
	}
	
	

}

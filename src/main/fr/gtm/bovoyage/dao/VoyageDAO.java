package fr.gtm.bovoyage.dao;

import fr.gtm.bovoyage.entities.Voyage;

public interface VoyageDAO {

	public void create(Voyage v);
	public void delete(Voyage v);
	public void update(Voyage v);
	public Voyage getVoyageById(long id);
	//

}

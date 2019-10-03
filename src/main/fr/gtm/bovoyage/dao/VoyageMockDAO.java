package fr.gtm.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.bovoyage.entities.Voyage;



public class VoyageMockDAO implements VoyageDAO {

	private List <Voyage> voyages = new ArrayList<Voyage>();
	public static long idCpt = 0; //simulation du compteur ; static car si +++ voyages dao instanciés il leur faut le MEME  compteur
	
	@Override
	public void create(Voyage v) {
		v.setId(++idCpt);
		voyages.add(v);
	}

	@Override
	public void delete(Voyage v) {
		voyages.remove(v);
		v.setId(0);
	}

	@Override
	public void update(Voyage v) {
		for (Voyage voyage : voyages) {
			if (voyage.getId() == v.getId()); {
			
			}
		}
	}
	

	@Override
	public Voyage getVoyageById(long id) {
		for(Voyage voyage : voyages) {
			if(voyage.getId() == id)
				return voyage;
	}
		return null;

	}
}

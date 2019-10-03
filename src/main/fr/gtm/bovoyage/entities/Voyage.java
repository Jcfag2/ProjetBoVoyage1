package fr.gtm.bovoyage.entities;
//
import java.util.List;

public class Voyage {
private String region;
private String descriptif;
private long id;
private DatesVoyage date;
private Client client;
private List<Voyageur> voyageurs;



public Voyage(String region, String descriptif, long id, DatesVoyage date, Client client, List<Voyageur> voyageurs) {
	super();
	this.region = region;
	this.descriptif = descriptif;
	this.id = id;
	this.date = date;
	this.client = client;
	this.setVoyageurs(voyageurs);
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

public String getDescriptif() {
	return descriptif;
}

public void setDescriptif(String descriptif) {
	this.descriptif = descriptif;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public DatesVoyage getDate() {
	return date;
}

public void setDate(DatesVoyage date) {
	this.date = date;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public List<Voyageur> getVoyageurs() {
	return voyageurs;
}

public void setVoyageurs(List<Voyageur> voyageurs) {
	this.voyageurs = voyageurs;
}
	
public double getPrixTotalHT() {
	double prixTotalHT = 0;
	double prixUnitaire = date.getTarifUnitaireHT();
	for (Voyageur voyageur : voyageurs) {
		prixTotalHT = prixTotalHT + prixUnitaire;
	}
			
	return prixTotalHT;
	
}

	
}

package fr.gtm.bovoyage.entities;

public class Voyage {
private String region;
private String descriptif;
private long id;
private DatesVoyage date;
private Client client;

public Voyage(String region, String descriptif, long id, DatesVoyage date, Client client) {
	this.region = region;
	this.descriptif = descriptif;
	this.id = id;
	this.setDate(date);
	this.setClient(client);
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
	


	
}

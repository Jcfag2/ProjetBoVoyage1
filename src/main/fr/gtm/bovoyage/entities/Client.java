package fr.gtm.bovoyage.entities;

public class Client {
	private String nom;
	private long id;

	public Client(String nom, long id) {
		this.nom = nom;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

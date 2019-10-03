package fr.gtm.bovoyage.entities;

import java.util.Date;

public class DatesVoyage {
	private Date dateAller;
	private Date dateRetour;
	private double tarifUnitaireHT;
	private long id;
	
	public DatesVoyage(Date dateAller, Date dateRetour, double tarifUnitaireHT, long id) {
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.tarifUnitaireHT = tarifUnitaireHT;
		this.id = id;
		
	}
	
	
	public Date getDateAller() {
		return dateAller;
	}
	
	public void setDateAller(Date dateAller) {
		this.dateAller = dateAller;
	}
	
	public Date getDateRetour() {
		return dateRetour;
	}
	
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	public double getTarifUnitaireHT() {
		return tarifUnitaireHT;
	}
	
	public void setTarifUnitaireHT(double tarifUnitaireHT) {
		this.tarifUnitaireHT = tarifUnitaireHT;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
}

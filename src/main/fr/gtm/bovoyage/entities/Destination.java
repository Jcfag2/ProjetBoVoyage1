package fr.gtm.bovoyage.entities;

import java.util.List;

public class Destination {
private String region;
private String descriptif;
private String image;
private long id;
List<DatesVoyage> dates;




public Destination(String region, String descriptif, String image, long id, List<DatesVoyage> dates) {
	this.region = region;
	this.descriptif = descriptif;
	this.image = image;
	this.id = id;
	this.dates = dates;
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
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}




}

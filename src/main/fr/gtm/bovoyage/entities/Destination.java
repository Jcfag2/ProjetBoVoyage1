package fr.gtm.bovoyage.entities;

import java.util.Date;
import java.util.List;

public class Destination {
private String region;
private String descriptif;
private String image;
private long id;
List<DatesVoyage> dates;





public Destination(String region, String descriptif) {
	this.region = region;
	this.descriptif = descriptif;

	
}

public Destination() {

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

public List<DatesVoyage> getDates() {
	return dates;
}

public void setDates(List<DatesVoyage> dates) {
	this.dates = dates;
}




}

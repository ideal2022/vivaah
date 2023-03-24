package com.cg.marriageceremony.model;

import javax.persistence.Entity;

@Entity
public class Venue extends Vendor{
	private String vName;
	private String vDiscription;
	private String imagePath;
	
	
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvDiscription() {
		return vDiscription;
	}
	public void setvDiscription(String vDiscription) {
		this.vDiscription = vDiscription;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	


}

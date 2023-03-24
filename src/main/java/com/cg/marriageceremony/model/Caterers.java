package com.cg.marriageceremony.model;

import javax.persistence.Entity;

@Entity
public class Caterers extends Vendor {
	private String cName;
	private String cDiscription;
	private String imagePath;
	
	public String getcName() {
		return cName;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcDiscription() {
		return cDiscription;
	}
	public void setcDiscription(String cDiscription) {
		this.cDiscription = cDiscription;
	}
	

}

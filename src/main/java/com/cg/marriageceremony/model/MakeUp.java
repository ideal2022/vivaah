package com.cg.marriageceremony.model;

import javax.persistence.Entity;

@Entity
public class MakeUp extends Vendor{
	private String mName;
	private String mDiscription;
	private String imagePath;
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmDiscription() {
		return mDiscription;
	}
	public void setmDiscription(String mDiscription) {
		this.mDiscription = mDiscription;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	


}

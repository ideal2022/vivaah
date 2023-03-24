package com.cg.marriageceremony.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class CartItems {

	@Id
	@GeneratedValue
	private int cartId;
	@ManyToOne
	@JoinColumn(name="custId")
	//is back reference that omits the during the serialization  process
	@JsonBackReference("customer")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name="vendorId")
	@JsonBackReference("vendor")
	private Vendor vendor;
	
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	

}

package com.cg.marriageceremony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.marriageceremony.model.Vendor;
import com.cg.marriageceremony.service.VendorService;


@RestController
@RequestMapping("/marriageceremony")
@CrossOrigin(origins = "http://localhost:3000",methods = {RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
	public class VendorController {
	@Autowired
	private VendorService vendorService;

	@PostMapping("/add-vendor")
	public Vendor addVendor(@RequestBody Vendor vendorr) {
		Vendor vendor = vendorService.addVendor(vendorr);

		return vendor;
	}
	@PutMapping("/{vid}")
	public Vendor updateVendor(@RequestBody Vendor vendor ,@PathVariable int vid) {
		System.out.println("updating .....");
		Vendor v= new Vendor();
		v.setCategory(vendor.getCategory());
		v.setPrice(vendor.getPrice());
		v.setCartItems(vendor.getCartItems());
	    v.setContactNo(vendor.getContactNo());
		return vendorService.updateVendor(v,vid);
	}
	
	@GetMapping("/get-all-vendor")
	public List<Vendor> findAllVendor() {
		return vendorService.allVendor();
	}
	
	@DeleteMapping("/delete-vendor/{vid}")
	public int deleteVendor(@PathVariable("vid") int vid) {
		return vendorService.deleteVendor(vid);
	}
	
	@GetMapping("/{vid}")
	public Vendor searchVendorById(@PathVariable int vid) {
		return vendorService.searchVendorById(vid);
	}

	
}

	
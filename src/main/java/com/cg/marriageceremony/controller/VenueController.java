package com.cg.marriageceremony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.marriageceremony.model.Photography;
import com.cg.marriageceremony.model.Venue;
import com.cg.marriageceremony.service.PhotographyService;
import com.cg.marriageceremony.service.VenueService;

@RestController
@RequestMapping("/marriageceremony")
@CrossOrigin(origins = "http://localhost:3000",methods = {RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})

public class VenueController {

	@Autowired
	private VenueService venueService;
	
	@PostMapping("/add-venue")
	public  Venue addVenue(@RequestBody Venue venue1) {
	   Venue venue=venueService.addVenue(venue1);
				return venue;
	}
	@GetMapping("/get-all-venue")
	public List<Venue> allVenue(){
		return venueService.allVenue();
	}
    @GetMapping("/search-By-venueName")
    public List<Venue> SearchingByVenueName(@RequestParam("vname") String vName){
		return venueService.searchByVenuename(vName);
    }
   }
package com.cg.marriageceremony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.marriageceremony.model.Customer;
import com.cg.marriageceremony.secure.model.UserDto;
import com.cg.marriageceremony.secure.service.JwtUserDetailsService;
import com.cg.marriageceremony.service.CustomerService;


@RestController
@RequestMapping("/marriageceremony")
@CrossOrigin(origins = "http://localhost:3000",methods = {RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class CustomerController {
@Autowired
private CustomerService customerService;

@Autowired
private JwtUserDetailsService jwtUserDetailsService;

@PostMapping("/add-customers")
public Customer addCustomer(@RequestBody UserDto userDto) {
	
	Customer c = new Customer();
	c.setCustName(userDto.getCustName());
	c.setMobileNo(userDto.getMobileNo());
	c.setEmail(userDto.getUsername());
	//c.setPassword(userDto.getPassword());
	//c.setRole(userDto.getRole());
	Customer customer = customerService.addCustomer(c);
			

	//	UserDto userDto = new UserDto();
	//	userDto.setUsername(c.getEmail());
		//userDto.setPassword(c.getPassword());
		userDto.setRole("User");
		jwtUserDetailsService.save(userDto);

		return customer;
	}

@GetMapping("/find-all-customer")
        public List<Customer> findallcustomer() {
	    return customerService.allCustomers();
}
}

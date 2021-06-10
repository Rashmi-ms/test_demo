package com.flightbooking.adminservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.adminservice.entity.Flights;
import com.flightbooking.adminservice.service.AdminServiceImpl;



@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	@GetMapping("/all")
	public List<Flights> getAllDetails() {
		return adminServiceImpl.getAllDetails();
	}
	
	@GetMapping("/{flight_number}")
	public Flights getDetailsByFlightnumber(@PathVariable String flightnumber) 
	{
		return adminServiceImpl.getDetailsByFlightnumber(flightnumber);
	}
	
	@PostMapping("/add")
	public String addFlights(@RequestBody Flights flights) {
		adminServiceImpl.addFlights(flights);
		return ("Added flight details with flight number - " + flights.getFlightnumber() + " successfully..!!");
	}
	
	@DeleteMapping("/delete/{flight_number}")
	public ResponseEntity<Flights> deleteFlightsDetails(@PathVariable String flightnumber)
	{
		return adminServiceImpl.deleteFlights(flightnumber);
	}
	

}



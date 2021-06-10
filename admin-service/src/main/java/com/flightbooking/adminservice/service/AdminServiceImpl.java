package com.flightbooking.adminservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightbooking.adminservice.dao.AdminRepo;
import com.flightbooking.adminservice.entity.Flights;

@Service
public class AdminServiceImpl {
	
	@Autowired
	private AdminRepo adminRepo;

	public List<Flights> getAllDetails() {
		List<Flights> flights = new ArrayList<Flights>();
		adminRepo.findAll().forEach(flights1 -> flights.add(flights1));
		return flights;
	}

	public void addFlights(Flights flights) {
		adminRepo.save(flights);
		
	}

	public Flights getDetailsByFlightnumber(String flightnumber) {
		return adminRepo.findByFlightnumber(flightnumber);
	}


	public ResponseEntity<Flights> deleteFlights(String flightnumber) {
		Flights existingDetails=adminRepo.findByFlightnumber(flightnumber);
		adminRepo.delete(existingDetails);
		//adminRepo.deleteById(flight_number);
		return ResponseEntity.ok().build();
		}

	
	
}


package com.flightbooking.adminservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.adminservice.entity.Flights;


@Repository
public interface AdminRepo extends MongoRepository<Flights, String> {

	

	Flights findByFlightnumber(String flightnumber);

}

package com.flightbookingsystem.bookingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
	
	@GetMapping("/hellobooking")
	public String test(){
		return "Hello Booking Service";
	}
	
	
	@GetMapping("/hellobooking1")
	public String test1(){
		return "Hello Booking Service";
	}

}

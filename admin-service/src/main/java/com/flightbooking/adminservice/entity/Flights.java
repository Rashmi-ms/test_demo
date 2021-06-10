package com.flightbooking.adminservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="flight")
public class Flights {
	
	@Id
	private String id;
	
	private String flightnumber;

	private String flight_name;

	private String starting_from;

	private String destination;

	private int total_distance;

	private int fare;
	
	private String date_of_travel;
	
	private String departure_time;
	
	private String arrival_time;
	
	private int available_seats;
	
	public Flights(String id, String flightnumber, String flight_name, String starting_from, String destination,
			int total_distance, int fare, String date_of_travel,String departure_time,String arrival_time, int available_seats) {
		super();
		this.id = id;
		this.flightnumber = flightnumber;
		this.flight_name = flight_name;
		this.starting_from = starting_from;
		this.destination = destination;
		this.total_distance = total_distance;
		this.fare = fare;
		this.date_of_travel = date_of_travel;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.available_seats=available_seats;
	}

	public Flights() {
		super();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlight_number(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getStarting_from() {
		return starting_from;
	}

	public void setStarting_from(String starting_from) {
		this.starting_from = starting_from;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotal_distance() {
		return total_distance;
	}

	public void setTotal_distance(int total_distance) {
		this.total_distance = total_distance;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getDate_of_travel() {
		return date_of_travel;
	}

	public void setDate_of_travel(String date_of_travel) {
		this.date_of_travel = date_of_travel;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}


	
}
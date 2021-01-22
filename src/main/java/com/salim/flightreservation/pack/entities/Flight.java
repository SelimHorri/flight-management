package com.salim.flightreservation.pack.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight extends AbstractEntity {
// Begin Class
	
	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "operating_airlines")
	private String operationAirlines;
	
	@Column(name = "departure_city")
	private String departureCity;
	
	@Column(name = "arrival_city")
	private String arrivalCity;
	
	@Column(name = "date_of_departure")
	// private Date dateOfDeparture;
	private LocalDate dateOfDeparture;
	
	@Column(name = "estimated_departure_time")
	private Timestamp estimatedDepartureTime;
	
	public Flight() {
		
	}
	
	/*public Flight(String flightNumber, String operationAirlines, String departureCity, String arrivalCity,
			Date dateOfDeparture, Timestamp estimatedDepartureTime) {
		super();
		this.flightNumber = flightNumber;
		this.operationAirlines = operationAirlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	public Flight(int id, String flightNumber, String operationAirlines, String departureCity, String arrivalCity,
			Date dateOfDeparture, Timestamp estimatedDepartureTime) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.operationAirlines = operationAirlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}*/
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getOperationAirlines() {
		return operationAirlines;
	}
	
	public void setOperationAirlines(String operationAirlines) {
		this.operationAirlines = operationAirlines;
	}
	
	public String getDepartureCity() {
		return departureCity;
	}
	
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	
	public String getArrivalCity() {
		return arrivalCity;
	}
	
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	public LocalDate getDateOfDeparture() {
		return dateOfDeparture;
	}
	
	public void setDateOfDeparture(LocalDate dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
// End Class
}














package com.salim.flightreservation.pack.repositories;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.salim.flightreservation.pack.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
// Begin Interface
	
	@Query("FROM Flight WHERE departureCity = :departureCity AND arrivalCity = :arrivalCity AND dateOfDeparture = :dateOfDeparture")
	public abstract List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") LocalDate departureDate);
	
// End Interface
}

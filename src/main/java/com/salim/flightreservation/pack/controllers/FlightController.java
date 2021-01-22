package com.salim.flightreservation.pack.controllers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salim.flightreservation.pack.entities.Flight;
import com.salim.flightreservation.pack.repositories.FlightRepository;

@Controller
public class FlightController {
// Begin Class
	
	@Autowired
	private FlightRepository flightRepository;
	
	@GetMapping("/findFlights")
	public String showView() {
		return "find-flights";
	}
	
	@GetMapping("/listFlights")
	public String showFlights() {
		return "display-flights";
	}
	
	@PostMapping("/displayFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate departureDate, Model model) {
		
		List<Flight> flights = flightRepository.findFlights(from,to,departureDate);
		System.out.println("\n\n" + flights.size() + "\n");
		model.addAttribute("flights", flights);
		
		return "display-flights";
	}
	
// End Class
}

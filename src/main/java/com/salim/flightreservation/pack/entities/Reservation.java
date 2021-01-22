package com.salim.flightreservation.pack.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation extends AbstractEntity {
// Begin Class
	
	@Column(name = "checked_in")
	private boolean checkedIn;
	
	@Column(name = "number_of_bags")
	private int numberOfBags;
	
	// @Column(name = "passenger_id")
	@OneToOne
	private Passenger passenger;
	
	// @Column(name = "flight_id")
	@OneToOne
	private Flight flight;
	
	// @Column(name = "created")
	// private Timestamp created;
	
	public Reservation() {
		
	}
	
	/*public Reservation(boolean checkedIn, int numberOfBags, Passenger passenger, Flight flight) {
		super();
		this.checkedIn = checkedIn;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}
	
	public Reservation(int id, boolean checkedIn, int numberOfBags, Passenger passenger, Flight flight) {
		super();
		this.id = id;
		this.checkedIn = checkedIn;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}*/
	
	public boolean isCheckedIn() {
		return checkedIn;
	}
	
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	public int getNumberOfBags() {
		return numberOfBags;
	}
	
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}
	
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	public Flight getFlight() {
		return flight;
	}
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
// End Class
}













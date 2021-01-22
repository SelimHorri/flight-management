package com.salim.flightreservation.pack.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger extends AbstractEntity {
// Begin Class
	
	@Column(name = "first_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lname;
	
	@Column(name = "middle_name")
	private String mname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	public Passenger() {
		
	}
	
	/*public Passenger(String fname, String lname, String mname, String email, String phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.email = email;
		this.phone = phone;
	}
	
	public Passenger(int id, String fname, String lname, String mname, String email, String phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.email = email;
		this.phone = phone;
	}*/
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getMname() {
		return mname;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
// End Class
}

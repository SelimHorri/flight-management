package com.salim.flightreservation.pack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salim.flightreservation.pack.entities.User;

public interface UserRepisitory extends JpaRepository<User, Integer> {
// Begin Interface
	
	public abstract User findByEmail(String email); // Spring will automatically create query for us "SELECT * FROM User WHERE email = '?'" . But the method MUST be with this structure : findUserByEmail(email). this email param MUST be an attribute in User entity so Spring understand that it must create an auto-query (by following method name structure, and by passing entity attribute as param)
	
// End Interface
}

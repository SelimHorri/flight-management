package com.salim.flightreservation.pack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salim.flightreservation.pack.entities.User;
import com.salim.flightreservation.pack.repositories.UserRepisitory;

@Controller
public class UserController {
// Begin Class
	
	@Autowired
	private UserRepisitory userRepisitory;
	
	@GetMapping("/register")
	public String showRegistrationPage() {
		return "login/register-user";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login/login";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user, @RequestParam("confirmPassword") String pwd2, Model model) {
		
		String fname = user.getFname().trim();
		String lname = user.getLname().trim();
		String email = user.getEmail().trim();
		
		boolean b1 = fname.isEmpty() || lname.isEmpty() || email.isEmpty() || user.getPassword().isEmpty() || pwd2.isEmpty();
		
		if (b1) {
			model.addAttribute("error", "Some field(s) is/are missing, Please fill it/them out");
			return "login/register-user";
		}
		else {
			if (!user.getPassword().equals(pwd2)) {
				model.addAttribute("error", "Password are not same, please passwords..");
				return "login/register-user";
			}
			else {
				userRepisitory.save(user);
				return "login/login";
			}
		}
		
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String pwd, Model model) {
	// Begin loginUser()
		
		email = email.trim();
		
		if (email.isEmpty() || pwd.isEmpty()) {
			model.addAttribute("error", "Some field(s) is/are missing !");
			return "login/login";
		}
		else {
			
			User user = userRepisitory.findByEmail(email);
			
			if (user == null) {
				model.addAttribute("error", "No such record, try again !!");
				return "login/login";
			}
			else {
				
				if (user.getPassword().equals(pwd)) {
					model.addAttribute("msg", "Welcome Mr." + user.getLname().toUpperCase() + " " + user.getFname());
					return "find-flights";
				}
				else {
					model.addAttribute("error", "Invalid password, try again !");
					return "login/login";
				}
				
			}
			
		}
		
	// End loginUser()
	}
	
// End Class
}















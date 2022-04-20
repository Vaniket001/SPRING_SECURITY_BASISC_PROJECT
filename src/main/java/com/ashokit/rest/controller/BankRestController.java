package com.ashokit.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/home")
	public String home() {
		String msg="Welcome To Ashok It Bank";
		return msg;
	}
	@GetMapping("/balance")
	public String getBalance() {
		String msg="Your Current Balance is : Rs.4500.00/-";
		return msg;
	}
	@GetMapping("/statement")
	public String getStmt() {
		String msg="Your Statement Generated and Send To Email Id";
		return msg;
	}
	@GetMapping("/lone")
	public String getMyLone() {
		String msg="Your Lone Due Is : RS.51000.00/-";
		return msg;
	}
	@GetMapping("/contact")
	public String contact() {
		String msg="Thank You For Contacting Customer Support , We Will Get Back Soon !!";
		return msg;
	}

}

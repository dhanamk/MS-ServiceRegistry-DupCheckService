package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DupcheckController {

	@GetMapping("/dupcheck")
	public String getDupcheckService()
	{
		return "Welcome to Dupcheck-Sevice";
	}
	@GetMapping("/two")
	public String getDupcheckServiceTwo()
	{
		return "Welcome to Dupcheck-Sevice Two";
	}
}

package com.subhoTech.SomeService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeServiceController {
	
	@GetMapping("/home")
	public String getMessage() {
		return "Let's start";
	}

}

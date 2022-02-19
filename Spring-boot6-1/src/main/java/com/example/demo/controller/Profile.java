package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Profile {
	@GetMapping("/profile")
	public String greeting(@ModelAttribute Profile profile) {
		return "greeting";
	}
	
	@PostMapping("/profile")
	public String register(@Validated @ModelAttribute Profile profile, BindingResult result) {
		if(result.hasErrors()) {
			return "greeting";
		}
		return "show";
	}
}

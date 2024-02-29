package com.bridgelabz.greetings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetings.entity.Greetings;
import com.bridgelabz.greetings.services.GreetingsService;


@RestController
public class MyController {

	@Autowired
	private GreetingsService greetingsService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Greetings application";
	}
	
	@GetMapping("/greetings")
	public List<Greetings> getGreetings(){
		
		return this.greetingsService.getGreetings();
	}
	
	@GetMapping("/greetings/{greetingsId}")
	public Greetings getCourse(@PathVariable String greetingsId) {
		
		return this.greetingsService.getGreeting(Long.parseLong(greetingsId));
	}
	
	@PostMapping("/greetings")
	public Greetings addGreetings(@RequestBody Greetings greetings) {
		
		return this.greetingsService.addGreetings(greetings);
	}
	
	@PutMapping("/greetings")
	public Greetings updateCourse(@RequestBody Greetings greetings) {
		return this.greetingsService.updateGreetings(greetings);
	}
	
	@DeleteMapping("greetings/{greetingsId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String greetingsId){
		try {
			this.greetingsService.deleteGreetings(Long.parseLong(greetingsId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
	


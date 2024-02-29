package com.bridgelabz.greetings.services;

import java.util.List;

import com.bridgelabz.greetings.entity.Greetings;


public interface GreetingsService {
	
public List<Greetings> getGreetings();
	
	public Greetings getGreeting(long greetingsId);
	
	public Greetings addGreetings(Greetings greetings);
	
	public Greetings updateGreetings(Greetings greetings);
	
	public void deleteGreetings(Long parseLong);

}

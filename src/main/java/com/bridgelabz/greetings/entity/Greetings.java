package com.bridgelabz.greetings.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Greetings {

	@Id
	private long id;
	private String employee;
	private String Gdescription;
	
	
	public Greetings(long id, String employee, String Gdescription) {
		super();
		this.id = id;
		this.employee = employee;
		this.Gdescription = Gdescription;
	}


	public Greetings() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEmployee() {
		return employee;
	}


	public void setEmployee(String employee) {
		this.employee = employee;
	}


	public String getGdescription() {
		return Gdescription;
	}


	public void setGdescription(String Gdescription) {
		this.Gdescription = Gdescription;
	}


	@Override
	public String toString() {
		return "Greetings [id=" + id + ", title=" + employee + ", description=" + Gdescription + "]";
	}
	
	
	
}
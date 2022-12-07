package com.Technosignia.Autocare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	String type;
	
	Long passanger_capacity;
	
	Double flyTime;
	
	Double baggage_capacity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getPassanger_capacity() {
		return passanger_capacity;
	}

	public void setPassanger_capacity(Long passanger_capacity) {
		this.passanger_capacity = passanger_capacity;
	}

	public Double getFlyTime() {
		return flyTime;
	}

	public void setFlyTime(Double flyTime) {
		this.flyTime = flyTime;
	}

	public Double getBaggage_capacity() {
		return baggage_capacity;
	}

	public void setBaggage_capacity(Double baggage_capacity) {
		this.baggage_capacity = baggage_capacity;
	}
	
	
	

}

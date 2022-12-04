package com.Technosignia.Autocare.entity;

import javax.persistence.Entity;

@Entity

public class JobCard {

	Long Jcno;
	
	long listoffault;
	
	String mechanic;
	
	long date;
	
	long vehicle;
	
	String status;
	
    String customer;

	public Long getJcno() {
		return Jcno;
	}

	public void setJcno(Long jcno) {
		Jcno = jcno;
	}

	public long getListoffault() {
		return listoffault;
	}

	public void setListoffault(long listoffault) {
		this.listoffault = listoffault;
	}

	public String getMechanic() {
		return mechanic;
	}

	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public long getVehicle() {
		return vehicle;
	}

	public void setVehicle(long vehicle) {
		this.vehicle = vehicle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
}

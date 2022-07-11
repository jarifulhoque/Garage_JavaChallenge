package com.qa.garage;

public class Motorcycle extends Vehicle {
	// attributes
	private String bodytype;
	private int capacity;
	
	// default constructor
	public Motorcycle() {
	}
	
	// Everything constructor
	public Motorcycle(int fuelcapacity, int mileage, String model, String bodytype, int capacity) {
		super(fuelcapacity, mileage, model);
		this.bodytype = bodytype;
		this.capacity = capacity;
	}
	
	// Getters & Setters
	public String getBodytype() {
		return bodytype;
	}

	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	//toString
	@Override
	public String toString() {
		return "Motorcycle [bodytype=" + bodytype + ", capacity=" + capacity + ", Fuelcapacity="
				+ getFuelcapacity() + ", Mileage=" + getMileage() + ", Model=" + getModel() + "]";
	}
	
}


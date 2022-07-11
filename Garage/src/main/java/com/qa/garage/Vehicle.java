package com.qa.garage;

public class Vehicle {
	//attributes
	private int fuelcapacity;
	private int mileage;
	private String model;
	
	// default constructor
	public Vehicle() {
	}
	
	//Everything constructor
	public Vehicle(int fuelcapacity, int mileage, String model) {
		super();
		this.fuelcapacity = fuelcapacity;
		this.mileage = mileage;
		this.model = model;
	}
	
	//Getters & Setters
	public double getFuelcapacity() {
		return fuelcapacity;
	}

	public void setFuelcapacity(int fuelcapacity) {
		this.fuelcapacity = fuelcapacity;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	//toString
	@Override
	public String toString() {
		return "Vehicle [fuelcapacity=" + fuelcapacity + ", mileage=" + mileage + ", model=" + model + "]";
	}

}

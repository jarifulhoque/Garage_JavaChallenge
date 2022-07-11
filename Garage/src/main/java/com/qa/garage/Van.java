package com.qa.garage;

public class Van extends Vehicle {
	// attributes
	private String fueltype;
	private int enginepower;
	
	// default constructor
	public Van() {
	}

	// Everything constructor
	public Van(int fuelcapacity, int mileage, String model, String fueltype, int enginepower) {
		super(fuelcapacity, mileage, model);
		this.fueltype = fueltype;
		this.enginepower = enginepower;
	}

	// Getters & Setters
	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getEnginepower() {
		return enginepower;
	}

	public void setEnginepower(int enginepower) {
		this.enginepower = enginepower;
	}
	
	//toString
	@Override
	public String toString() {
		return "Van [fueltype=" + fueltype + ", enginepower=" + enginepower + ", Fuelcapacity=" + getFuelcapacity()
				+ ", Mileage=" + getMileage() + ", Model=" + getModel() + "]";
	}

}

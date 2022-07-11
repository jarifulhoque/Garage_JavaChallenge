package com.qa.garage;

public class Car extends Vehicle {
	//attributes
	private int doors;
	private String gearbox;
	private String colour;
	
	// default constructor
	public Car() {
	}
	
	//Everything constructor
	public Car(int fuelcapacity, int mileage, String model, int doors, String gearbox, String colour) {
		super(fuelcapacity, mileage, model);
		this.doors = doors;
		this.gearbox = gearbox;
		this.colour = colour;
	}

	//Getters & Setters
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	// toString
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", gearbox=" + gearbox + ", colour=" + colour + ", Fuelcapacity="
				+ getFuelcapacity() + ", Mileage=" + getMileage() + ", Model=" + getModel() + "]";
	}
	

}

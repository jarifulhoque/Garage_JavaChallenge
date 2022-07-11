package com.qa.garage;

import java.util.*;

public class Garage {
	// initialise vehicle Arraylist
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	// add record to list- vehicle to the Garage
	public void addVehicle(Vehicle v) {
		vehicle.add(v);
	}
	
	//delete record from list if it's a Car
	public void removeVehicle(Vehicle v) {
		for(Vehicle v1 : vehicle) {
			if(vehicle instanceof Car) {
				vehicle.remove(v1);
			}
			else {
				System.out.println(vehicle);
			}
		}
	}
	
	// clear all records from list
	public void empty() {
		vehicle.clear();
	}
	
	// for each loop to print all records
	public void printall() {
		for(Vehicle vehicle : vehicle) {
			System.out.println(vehicle);
		}
	}
	
	public void fix() {
		int cost;
		for(Vehicle vehicle : vehicle) {
			if(vehicle instanceof Car) {
				cost=3000;
				System.out.println("Cost of repair will be £" + cost);
			}
			else if(vehicle instanceof Motorcycle) {
				cost=1500;
				System.out.println("Cost of repair will be £" + cost);
			}
			else if(vehicle instanceof Van) {
				cost=6000;
				System.out.println("Cost of repair will be £" + cost);
			}
		}
	}
}

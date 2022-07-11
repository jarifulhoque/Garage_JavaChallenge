package com.qa.garage;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
		
		garage.addVehicle(new Car(40, 60, "BMW", 5, "Auto", "Blue"));
		garage.addVehicle(new Motorcycle(17, 10, "Kawasaki", "Sports Tourer", 1400));
		garage.addVehicle(new Van(110, 70, "Ford", "Diesel", 150));
		
		garage.printall();
		garage.fix();
		garage.removeVehicle(null);
		garage.empty();
	}
}

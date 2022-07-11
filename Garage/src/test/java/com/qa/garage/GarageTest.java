package com.qa.garage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.garage.Car;
import com.qa.garage.Vehicle;
import com.qa.garage.Garage;
import com.qa.garage.Motorcycle;
import com.qa.garage.Van;

public class GarageTest {
	
	Garage tryMe = new Garage();
	
	@Test
	public void addCar() {
		Vehicle v = new Car(50, 200, "AUDI", 3, "Auto", "Red");
		 assertEquals("New Vehicle added", tryMe.addCar(v));
	}
	
	@Test
	public void Motorcycle() {
		toString();
	}
	@Test
	public void Van() {
		toString();
	}
}

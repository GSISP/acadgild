package com.acadgild.abstracts;

public class Truck extends Vehicle {
	public Truck() {
		maxSpeed = 80;
	}

	public void showMaxSpeed() {
		System.out.println("Truck max speed: " + maxSpeed + " km/h");
	}
	//Truck class will override this method because the default implementation
	//is not appropriate for Bus class
	public int getWheelsNumber() {
		return 10;
	}
}
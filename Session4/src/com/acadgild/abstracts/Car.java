package com.acadgild.abstracts;

class Car extends Vehicle {
	public Car() {
		maxSpeed = 180; 
	}

	@Override
	public void showMaxSpeed() {
		System.out.println("Car max speed: " + maxSpeed + " km/h");
	}
	//Car class will inherit getWheelsNumber() method from the parent class
	//there is no need to override this method because default implementation
	//is appropriate for Car class - 4 wheels
}
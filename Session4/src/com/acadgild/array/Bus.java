package com.acadgild.array;

public class Bus extends Vehicle {
	public Bus() {
		maxSpeed = 100; 
	}

		//Bus class will override this method because the default implementation
	//is not appropriate for Bus class
	public int getWheelsNumber() {
		return 6;
	}

	@Override
	void showMaxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Bus max speed: " + maxSpeed + " km/h");
	}
}

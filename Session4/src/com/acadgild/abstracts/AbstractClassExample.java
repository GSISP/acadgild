package com.acadgild.abstracts;



public class AbstractClassExample {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bus = new Bus();
		Vehicle truck = new Truck();
		car.showMaxSpeed();
		bus.showMaxSpeed();
		truck.showMaxSpeed();
		
		System.out.println("Wheels number-car:" + car.getWheelsNumber() + 
				", bus:" + bus.getWheelsNumber() + ", truck:" + truck.getWheelsNumber());
	
	}

}

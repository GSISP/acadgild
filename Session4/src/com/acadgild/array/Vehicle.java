package com.acadgild.array;

abstract class Vehicle {
	//subclasses will inherit an attribute
	int maxSpeed;
	//subclasses must implement this method 
	//(otherwise they have to be declared as abstract classes)
	abstract void showMaxSpeed(); 
	//subclass will have this method (through inheritance) as is (default implementation)
	//or they may implement their own implementation (override a method)
	int getWheelsNumber() {
		return 4;
	}
}


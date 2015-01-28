package com.acadgild.interfaces;

public class MotorCar implements Suzuki, Ford  {

	public MotorCar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MotorCar mc1 = new MotorCar(); 
		mc1.body(); 
		mc1.engine();

	}



	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Fit Ford engine"); 
	}

	public void body() {
		// TODO Auto-generated method stub
		System.out.println("Fit Suzuki body"); 
	}

	public void sum() {
		// TODO Auto-generated method stub
		
	}

}

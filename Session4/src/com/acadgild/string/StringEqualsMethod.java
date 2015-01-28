package com.acadgild.string;

class StringEqualsMethod {

	public static void main(String args[]){

		String obj1 = new String("xyz");
		String obj2 = new String("xyz");

		if(obj1 == obj2)//address 
			System.out.println("obj1==obj2 is TRUE");
		else
			System.out.println("obj1==obj2 is FALSE");

		if(obj1.equals(obj2))//value
			System.out.println("obj1==obj2 is TRUE");
		else
			System.out.println("obj1==obj2 is FALSE");

		// now obj2 and obj1 reference the same place in memory
		obj2 = obj1;

		if(obj1 == obj2)
			System.out.println("obj1==obj2 is TRUE");
		else
			System.out.println("obj1==obj2 is FALSE");

	}
}

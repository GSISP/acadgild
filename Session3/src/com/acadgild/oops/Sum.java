package com.acadgild.oops;

class Sum {
	int x, y, z=100;
	String p, q;
	
	static int xyz=200;

	Sum(int a, int b) {
		x = a; //10
		y = b; //20
		z = a + b; //30
		System.out.println("The sum of numbers is: " + z);
	}

	Sum(String h, String i) {
		p = h;
		q = i;
		System.out.println("Hi, " + p + " " + q);
	}
	
	
	int diff(int num1,int num2){
		
		int diffe=num1-num2;
		return diffe;	
		}
	
	static int mul(int num1,int num2){
		
		int diffe=num1*num2;
		return diffe;	
		}
}

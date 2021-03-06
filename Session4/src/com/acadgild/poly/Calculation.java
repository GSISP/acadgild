package com.acadgild.poly;

class Calculation { 

	// 1st method which will calculate addition of two integer number
	void sum(int a,int b){ 
		System.out.println(a+b);
	}  

	// 2nd method which will calculate addition of three integer number, 
	//method name same as method1 but total number of argument is different
	void sum(int a,int b,int c){ 
		System.out.println(a+b+c);
	}  

	// 3rd method which will calculate addition of two fractional number, 
	//method name same as method1 but type of argument is different
	void sum(double a,double b){
		System.out.println(a+b);
	}

	// 4th method which will calculate addition of one integer and one fractional number, 
	//method name same as method1 but type of argument is different
	void sum(int a,double b){
		System.out.println(a+b);
	}

	// 5th method which will calculate addition of one fractional and one integer number, 
	//method name same as method4 but order of argument is different
	void sum(double a,int b){
		System.out.println(a+b);
	}

	public static void main(String args[]){  
		Calculation obj=new Calculation();  
		obj.sum(20,20);  // call method 1st
		obj.sum(10,10,10); // call method 2nd 
		obj.sum(10.5,10.5);  // call method 3rd
		obj.sum(10,10.5);  // call method 4th
		obj.sum(10.5,10);  // call method 5th
	}  

} 


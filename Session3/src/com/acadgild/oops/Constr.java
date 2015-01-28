package com.acadgild.oops;

class Constr
{
public static void main(String args[]) //Constr.main(...)
{
	Sum k = new Sum("Rakesh", "Kumar");
	Sum d = new Sum(10, 20);
   
	int data1= d.diff(50,20);//non static ---- local, data will change based on obj
	int data= Sum.mul(10, 30);// static way --- global, updated value
	
   System.out.println(" the mul between two numbers : "+data+
		   " static variable value :"+Sum.xyz);
	
}
}

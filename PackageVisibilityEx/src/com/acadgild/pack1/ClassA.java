package com.acadgild.pack1;

import com.acadgild.visible.ClassC;

public class ClassA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//// same class , same package
		ClassA obj = new ClassA();
		int i = obj.default_v;
		int j = obj.private_v;
		int k = obj.public_v;

		//// diff class, same package
		ClassB obj2 = new ClassB();
		int i2 = obj2.default_v;
		                 //int j2 = obj2.private_v;
		int k2 = obj2.public_v;
		
		////diff class, diff package
		ClassC obj3=new ClassC();
		int k3=obj3.public_v;
		           //int i3 = obj3.default_v;
		           //int j3 = obj3.private_v;		

	}

	public int public_v = 10;
	private int private_v = 10;
	int default_v = 10;

}

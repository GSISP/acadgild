package com.acadgild.visibility;

import com.acadgild.visible.ClassVisible2;

public class ClassVisibility1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// same class , same package
		ClassVisibility1 obj = new ClassVisibility1();
		int i = obj.default_v;
		int j = obj.private_v;
		int k = obj.public_v;

		// diff class, same package
		ClassVisibility2 obj2 = new ClassVisibility2();
		int i2 = obj2.default_v;
		int j2 = obj2.private_v;
		int k2 = obj2.public_v;
		
		// diff class, diff package
		ClassVisible2 obj3=new ClassVisible2();
		int k3=obj3.public_v;
		int i3 = obj3.default_v;
		int j3 = obj3.private_v;		

	}

	public int public_v = 10;
	private int private_v = 10;
	int default_v = 10;

}

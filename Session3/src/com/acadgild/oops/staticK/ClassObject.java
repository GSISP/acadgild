package com.acadgild.oops.staticK;

class ClassObject {
	static int count = 0;

	ClassObject() {
		count++;
	}

	static void display() {
		System.out.println("No. of object created:" + count);
	}
}

package com.acadgild.oops.encap;

class ThisClass {
	public static void main(String args[]) {
		XYZ obj = new XYZ();
		obj.setName("acadgild");
		obj.setNumId(234);

		System.out.println(obj.getName() + " id is " + obj.getNumId());

	}
}

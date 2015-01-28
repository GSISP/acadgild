package com.acadgild.exception;

import java.io.IOException;

class ThrowExample { 
	void mymethod(int num) throws IOException, ClassNotFoundException{ 
		if(num==202)
			throw new IOException("Exception Message1");
		else
			throw new ClassNotFoundException("Exception Message2");
	} 
} 

public class DemoThrowsException{ 
	public static void main(String args[]){ 
 
			ThrowExample obj=new ThrowExample(); 
			try {
				obj.mymethod(202);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 }
}
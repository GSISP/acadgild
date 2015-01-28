package com.acadgild.methods;

import java.util.Scanner;



class Factorial {
	public static void main(String arg[]) {
		int num;
		
		Scanner ins = new Scanner(System.in);

		System.out.print("Enter the no.");
		num = Integer.parseInt(ins.nextLine());

		System.out.print("Factorial is " + fact(num));// 5
		
		ins.close();
	}
//5*4*3*2*1
	static int fact(int n) {//4
		if (n == 1)
			return 1;
		else
			return (n * fact(n - 1));//5*fact(4)
	}
}

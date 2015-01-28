package com.acadgild.exception;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {

		int a, b, result = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

			a = input.nextInt();
			b = input.nextInt();
			try{
				result  = a / b;
			}
			catch(ArithmeticException e){
				System.out.print("102 error");
			}
			
			finally{
				input.close();
			}
			System.out.println("Result = " + result);
		
	}
	}
package com.acadgild.array;

class TwoDimensionalArray {
	public static void main(String arg[]) {
		int i, j;
		int a[][] = new int[5][10];
		for (i = 1; i <= a.length; i++) {
			for (j = 1; j <= a[i].length; j++) {
				a[i - 1][j - 1] = i * j;
				System.out.print(a[i - 1][j - 1] + "\t");
			}
			System.out.print("\n");
		}
	}
}

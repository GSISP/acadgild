package com.acadgild.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample
{
	public static void main(String[] args) {
		// use type inference for ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(6);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
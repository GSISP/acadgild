package com.acadgild.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample
{
	public static void main(String[] args) {
		// use type inference for HashSet
		Set<Integer> set = new HashSet<Integer>();
		set.add(6);
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(6);
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
package com.one.collectionarraylist;

import java.util.ArrayList;

public class Demo {
	public static void main(String [] args) {
		ArrayList <Integer> nums=new ArrayList <Integer> ();
		nums.add(1191);
		nums.add(1178);
		nums.add(1173);
		nums.add(9624);
		nums.add(657);
		nums.add(987);
		System.out.println(nums.get(2));
		nums.set(2, 9842);
		System.out.println(nums.get(2));
		nums.remove(2);
		System.out.println(nums.get(2));
		System.out.println(nums.size());
		System.out.println(nums);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
	}
		for(int a:nums) {
			System.out.println((a));
		}
	}
}

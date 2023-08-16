package com.one.collectionarraylist;

import java.util.ArrayList;

public class Even {
	public static void main(String [] args) {
		ArrayList <Integer> nums=new ArrayList <Integer> ();
		nums.add(13);
		nums.add(12);
		nums.add(7);
		nums.add(9);
		nums.add(80);
		nums.add(64);
		nums.add(17);
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)%2==0) {
				System.out.println(nums.get(i));
			}
		}
}
}

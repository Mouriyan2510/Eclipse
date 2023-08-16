package com.one.polymorphism;

public class Prime {
	public static void main(String [] args) {
		int nums[]= {9,11,13,17,4,2,25};
		for(int i=0;i<nums.length;i++){
			if(nums[i]/2!=0&&nums[i]/3!=0||nums[i]==2) {
				System.out.println(nums[i]+" is Prime");
			}
			else {
				System.out.println(nums[i]+" is NP");
			}
		}
		
	}

}

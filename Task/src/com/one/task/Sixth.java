package com.one.task;

public class Sixth {
	public static void main(String [] args) {
		int []arr= {1,2,3,4,5,0,6,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((arr[i]+arr[j])==5) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}


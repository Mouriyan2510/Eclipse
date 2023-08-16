package com.one.dayyy;

import java.util.Arrays;

public class UseMinInterface {
	
		public void getMin(int[]a) {
		int min=Arrays.stream(a).min().orElseThrow();
		if(min%2==0) {
		System.out.println(min+" is even");
	}
		else {
			System.out.println(min+" is odd");
		}
		}

}

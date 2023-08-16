package com.one.task;

import java.util.Arrays;
import java.util.List;

public class ListIntegerTo5 {
	public static void main(String [] args) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
		 int[] intArray = nums.stream().mapToInt(Integer::intValue).toArray();
		 String d="";
		 for(int i=0;i<intArray.length;i++) {
			 d=d+intArray[i];
		 }
		 char[]f=d.toCharArray();
		 for(int i=0;i<f.length;i++) {
			 for(int j=0;j<f.length;j++) {
				 if(i+j==5) {
					 System.out.println(i+" + "+j+"--->5");
				 }
			 }
		 }
	}

}

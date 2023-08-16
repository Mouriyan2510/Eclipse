package com.one.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class Third {
	public static void main(String [] args) {
		int[] arr= {2,6,7,8,10,5,6,7,4,9,10};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);//asc
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);//desc
		}
		int sh=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(sh);//second highest
		
		int i,j,u;
		for(i=0;i<arr.length;i++) {
			u=1;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j] == arr[i]){
					u=u+1;
				}
				else {
					break;
				}
			}
		
		 i=j-1;
         if(u > 1){
        	 System.out.println(arr[i] + "-- " + u);//count and print duplicate
	}
		}
		
		
		
		for (int k=0; k<arr.length; k++)
	    {
	        int l;
	        for (l=0; l<k; l++)
	           if (arr[k] == arr[l])
	               break;
	 
	        if (k == l)
	        	System.out.println(arr[k]);//print unique 
	        }
		
		
}
}

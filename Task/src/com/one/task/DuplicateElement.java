package com.one.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {  
	    public static void main(String[] args) {      
	          
	        //Initialize array   
//	        int [] arrr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
	    	List<Integer>arr=Arrays.asList(4,4,5,5,6);
//	    	List<String>arr=Arrays.asList("t", "e", "e", "s", "s", "s", "h");
	    	arr.stream().collect(Collectors.groupingBy(t->t,Collectors.counting())).forEach((t,y)->{
	    		if(y>1) {
	    			System.out.print(t+"---"+y);
	    		}
	    	});
	    	
	    	
	    }  
	}


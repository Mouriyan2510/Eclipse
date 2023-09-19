package com.one.dayyy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class tt {
	public static void main(String[] args) {

		        List<Integer> t = new ArrayList<>();
		        t.add(1);
		        t.add(2);
		        t.add(3);
		        t.add(4);
		        t.add(1);
		       Map<Integer, Long>map= t.stream().collect(Collectors.groupingBy(r->r,Collectors.counting()));
		       map.forEach((j,y)-> {
		    	   if(y>1) {
		    		   System.out.println(t+" is already exist");
		    	   }
		    	   else {
		    		   System.out.println(t);
		    	   }
		       });
	}
		}


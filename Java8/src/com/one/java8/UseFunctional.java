package com.one.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseFunctional {
//	public static void main(String[] args) {
//	Functional f=(a,b)-> (a+b);
//	System.out.println(f.Math(10, 15));
//	Functional f1=(a,b)-> (a-b);
//	System.out.println(f.Math(10, 15));
//	System.out.println();
//	Functional f=()-> 12;
//	System.out.println(f.Math());
//		Functional f = (a, b, c) -> {
//			if (a > b && a > c) {
//				return a + " is greater";
//			} else if (b > a && b > c) {
//				return b + " is greater";
//			} else {
//				return c + " is greater";
//			}
//		};
//		
		
		    public static String compressArray(String[] input) {
		        if (input == null || input.length == 0) {
		            return "";
		        }

		        StringBuilder compressed = new StringBuilder();
		        int count = 1;

		        for (int i = 0; i < input.length - 1; i++) {
		            if (input[i].equals(input[i + 1])) {
		                count++;
		            } else {
		                compressed.append(input[i]);
		                if (count > 1) {
		                    compressed.append(count);
		                }
		                count = 1;
		            }
		        }

		        // Append the last character and its count (if applicable)
		        compressed.append(input[input.length - 1]);
		        if (count > 1) {
		            compressed.append(count);
		        }

		        return compressed.toString();
		    }

		    public static void main(String[] args) {
		        String[] input = {"t", "e", "e", "s", "s", "s", "h"};
		        String output = compressArray(input);
		        System.out.println(output); // Output: te2s3h
		    }

		
		
		
		
		
//		String[]Input = {"t", "e", "e", "s", "s", "s", "h"};
//		List<String>a=Arrays.asList(Input);
////		a.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet()
////         .stream()
////         .map(entry -> entry.getKey() + (entry.getValue() > 1 ? entry.getValue():""))
////         .forEach(x->System.out.print(x));
//		String b="";
//		a.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).forEach((x,y)-> {
//			if(y==1) {
//				System.out.print(x);
//			}
//			else if(y>1){
//				System.out.print(x+y);
//			}
//		});
		
		
//		LocalDate currentDate = LocalDate.now();
//        System.out.println("Current date: " + currentDate);
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        System.out.println("Current date and time: " + currentDateTime);
//		System.out.println(f.Math(10, 20, 56));

	}

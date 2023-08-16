/**
 * 
 */
package com.one.day5Conditions;

public class Example {
public static void main(String[] args) {
	String a=args[0];
	if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
		System.out.println("Word contains Vowels");
	}
	else {
		System.out.println("Does not Contains Vowels");
	}
	}

}

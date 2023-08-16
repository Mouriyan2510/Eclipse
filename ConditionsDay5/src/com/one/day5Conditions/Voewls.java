package com.one.day5Conditions;

public class Voewls {
	public static void main(String [] args) {
		String a=args[0];
		if(a.startsWith("a")||a.startsWith("e")||a.startsWith("i")||a.startsWith("o")||a.startsWith("u")) {
			System.out.println(a+" contains vowels"+a.charAt(0));
			//System.out.println(a.charAt(0));
				}
		else {
			System.out.println(a+" Does not contain vowels");
	}

}}

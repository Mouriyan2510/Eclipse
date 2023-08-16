package com.one.for2;

public class Test {
	public static void main(String [] args) {
		String values[]= {"MOURI","RAJU","bell","CAL"};
		for(int i=0;i<values.length;i++) {
			if(values[i].equals(values[i].toLowerCase())) {
				System.out.println(values[i]);
			}
		}
	}
}

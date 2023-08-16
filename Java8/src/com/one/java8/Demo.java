package com.one.java8;

public interface Demo {
	public static String Place() {
		return "Chennai";
	}
	public default String Loc() {
		return "Tn";
	}
}

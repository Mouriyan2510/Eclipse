package com.one.task;

import java.util.Optional;

public class OptionalSample {
	public static void main(String[] args) {
		String s1 = null;
		Optional<String> name = Optional.ofNullable(s1);
//		if (name.isPresent()) {
//			System.out.println(s1);
//		} else {
//			System.out.println("Value Not Present");
//		}
		System.out.println(name.orElse(s1));
		System.out.println(name.orElse("Not Present"));
	}
}

package com.one.dayyy;

import java.util.Optional;

public class Optionaal {
	public static void main(String[] args) {
		String a=null;
		Optional<String> name = Optional.ofNullable(a);
		if(name.isPresent()) {
			System.out.println(a);
		}
		else {
			System.out.println("Not Present");
		}
		System.out.println(name.orElse("I'm waiting"));
	}

}

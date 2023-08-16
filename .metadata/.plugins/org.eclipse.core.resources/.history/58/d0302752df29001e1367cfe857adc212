package com.one.day1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fi {
	public static void main(String[] args) {

		//Function
		Function<String, Integer> stringLength = s -> s.length();
		int length = stringLength.apply("Hello! Mouriyan...");
		System.out.println("Length of the string: " + length);
		
		
		//Consumer
		Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
		printUpperCase.accept("hello! mouriyan"); // Output: HELLO, WORLD!



		// Example using Predicate functional interface
		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.println("Is 6 even? " + isEven.test(6)); // Output: Is 6 even? true
		System.out.println("Is 7 even? " + isEven.test(7)); // Output: Is 7 even? false


		// Example using Supplier functional interface
		Supplier<Double> randomNumberSupplier = () -> Math.random();
		System.out.println("Random number: " + randomNumberSupplier.get());


	}

}

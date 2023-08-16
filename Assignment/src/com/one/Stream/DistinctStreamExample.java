package com.one.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 5);
        
        // Create a stream from the list of numbers
        Stream<Integer> stream = numbers.stream();
        
        // Apply the distinct method to get unique elements
        Stream<Integer> distinctStream = stream.distinct();
        
        // Perform further operations on the distinct stream
        distinctStream
            .map(n -> n * 2)
            .filter(n -> n > 5)
            .forEach(System.out::println);
//        numbers.stream().distinct().forEach(t-> System.out.println(t));
    }
}

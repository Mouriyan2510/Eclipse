package com.one.Stream;

import java.util.Arrays;
import java.util.List;

public class LimitStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Create a stream from the list of numbers
        numbers.stream()
            .limit(4)
            .forEach(System.out::println);
    }
}

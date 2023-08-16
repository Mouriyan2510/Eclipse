package com.one.Stream;

import java.util.Arrays;
import java.util.List;

public class SkipStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Create a stream from the list of numbers
        numbers.stream()
            .skip(1)
            .forEach(System.out::println);
    }
}

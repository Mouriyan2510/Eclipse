package com.one.Stream;

import java.util.Arrays;
import java.util.List;

public class SortedStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,5, 3,6, 1, 4, 2);
        
        // Create a stream from the list of numbers
        numbers.stream()
            .sorted()
            .forEach(System.out::println);
    }
}


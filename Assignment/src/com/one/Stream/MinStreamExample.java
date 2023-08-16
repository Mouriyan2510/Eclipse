package com.one.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 0, 7);
        
        // Find the minimum element in the stream
        Optional<Integer> minElement = numbers.stream()
            .min(Integer::compareTo);
        
        if (minElement.isPresent()) {
            System.out.println("Minimum element: " + minElement.get());
        } else {
            System.out.println("Stream is empty");
        }
    }
}


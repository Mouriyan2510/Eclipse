package com.one.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 22, 9, 1, 7);
        
        // Find the maximum element in the stream
        Optional<Integer> maxElement = numbers.stream()
            .max(Integer::compareTo);
        
        if (maxElement.isPresent()) {
            System.out.println("Maximum element: " + maxElement.get());
        } else {
            System.out.println("Stream is empty");
        }
    }
}

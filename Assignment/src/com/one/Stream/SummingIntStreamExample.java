package com.one.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Calculate the sum of elements using summingInt
        int sum = numbers.stream()
            .collect(Collectors.summingInt(Integer::intValue));
        
        System.out.println("Sum of elements: " + sum);
    }
}

package com.one.task;

public class RepeatCharacters {
    public static void main(String[] args) {
        String input = "a1b2c3";
        String result = repeatCharacters(input);
        System.out.println("Output: " + result); // Output: abbccc
    }

    public static String repeatCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);
            int repeatCount = Character.getNumericValue(input.charAt(i + 1));
            for (int j = 0; j < repeatCount; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

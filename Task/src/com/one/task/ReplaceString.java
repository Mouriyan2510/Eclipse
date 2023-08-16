package com.one.task;

public class ReplaceString {
    public static void main(String[] args) {
        String input = "I live in India from Chennai in India";
        String output = replaceString(input, "India", "America");
        System.out.println(output);
    }

    public static String replaceString(String input, String target, String replacement) {
        // Convert the input string to a character array for easier manipulation
        char[] inputChars = input.toCharArray();
        char[] targetChars = target.toCharArray();
        char[] replacementChars = replacement.toCharArray();

        // Iterate through the input string to find occurrences of the target
        for (int i = 0; i <= inputChars.length - targetChars.length; i++) {
            boolean match = true;

            // Check if the target string is found at the current position
            for (int j = 0; j < targetChars.length; j++) {
                if (inputChars[i + j] != targetChars[j]) {
                    match = false;
                    break;
                }
            }

            // If the target is found, replace it with the replacement string
            if (match) {
                // Shift characters to make room for the replacement string
                int diff = replacementChars.length - targetChars.length;
                char[] newInputChars = new char[inputChars.length + diff];
                System.arraycopy(inputChars, 0, newInputChars, 0, i);
                System.arraycopy(replacementChars, 0, newInputChars, i, replacementChars.length);
                System.arraycopy(inputChars, i + targetChars.length, newInputChars, i + replacementChars.length, inputChars.length - i - targetChars.length);

                // Update the inputChars array with the modified characters
                inputChars = newInputChars;

                // Move the index i to skip the replacement string
                i += replacementChars.length - 1;
            }
        }

        // Convert the character array back to a string
        return new String(inputChars);
    }
}

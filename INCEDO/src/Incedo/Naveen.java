package Incedo;

public class Naveen {
    public static void main(String[] args) {
        String[] a = {"raju", "baiyakan", "raguvaran"};

        for (String str : a) {
            System.out.print("String: " + str + ", Vowels: ");
            countAndPrintVowels(str);
        }
    }

    public static void countAndPrintVowels(String str) {
        String vowels = "AEIOUaeiou"; // Define the vowels
        int vowelCount = 0; // Initialize the vowel count

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                // Check if the character is a vowel
                System.out.print(ch + " ");
                vowelCount++;
            }
        }

        System.out.println("(" + vowelCount + " vowels)");
    }
}

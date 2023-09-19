package Gavs;

public class ThirdAlpha {
    public static void main(String[] args) {
        String input = "abc123def"; // Replace with the user's input
        String result = reverseWithoutFirstNumber(input);
        String s="";
        char ch[]=result.toCharArray();
        for(int i=ch.length-1;i>=0;i--) {
        	s=s+ch[i];
        }
        
        System.out.println("Output: " + s);
    }

    private static String reverseWithoutFirstNumber(String input) {
        StringBuilder modified = new StringBuilder();

        boolean firstNumberRemoved = false;

        for (int i = 0;i<input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c) && !firstNumberRemoved) {
                firstNumberRemoved = true;
            } else {
                modified.append(c); 
            }
        }

        return modified.toString();
    }
}

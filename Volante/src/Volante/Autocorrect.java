package Volante;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Autocorrect {
    public static void main(String[] args) throws IOException {
        List<String> referenceWords = Files.lines(Paths.get("C:\\Users\\HP\\Desktop\\reference.txt"))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .collect(Collectors.toList());

        String inputText = Files.readString(Paths.get("C:\\Users\\HP\\Desktop\\input.txt"));
        String[] words = inputText.split("\\s+");

        StringBuilder correctedText = new StringBuilder();
        for (String word : words) {
            String correctedWord = findClosestMatch(word, referenceWords);
            correctedText.append(correctedWord).append(" ");
        }

        Files.writeString(Paths.get("C:\\Users\\HP\\Desktop\\output.txt"), correctedText.toString().trim());
        System.out.println("Generated Successfully");
    }

    private static String findClosestMatch(String word, List<String> referenceWords) {
        int minDistance = Integer.MAX_VALUE;
        String closestMatch = word;

        for (String referenceWord : referenceWords) {
            int distance = levenshteinDistance(word, referenceWord);
            if (distance < minDistance) {
                minDistance = distance;
                closestMatch = referenceWord;
            }
        }

        return closestMatch;
    }

    private static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= s2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int cost = s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1;
                dp[i][j] = Math.min(dp[i - 1][j - 1] + cost,
                                    Math.min(dp[i - 1][j] + 1,
                                             dp[i][j - 1] + 1));
            }
        }
        return dp[s1.length()][s2.length()];

    }
}

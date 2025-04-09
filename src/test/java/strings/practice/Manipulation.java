package strings.practice;

import java.util.List;

public class Manipulation {
    public static void main(String[] args) {
        String[] t = { "abc123", "def456", "ghu789" };
        String sentence = "This is my first day";
        StringBuilder senBuilder = new StringBuilder(sentence);
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        int oddIndexCounter = 1; // Start with the first odd index

        for (String str : t) {
            for (char vowelFromStr : str.toLowerCase().toCharArray()) {
                if (vowels.contains(vowelFromStr)) {
                    while (oddIndexCounter < senBuilder.length()) {
                        if (senBuilder.charAt(oddIndexCounter) != ' ' && vowels.contains(senBuilder.charAt(oddIndexCounter))) {
                            senBuilder.setCharAt(oddIndexCounter, vowelFromStr);
                            oddIndexCounter += 2; // Move to the next odd index
                            break; // Move to the next vowel from the string
                        }
                        oddIndexCounter++;
                    }
                }
            }
            // Reset the oddIndexCounter for the next string in 't' if needed (based on desired behavior)
            // If you want to continue from where you left off in the sentence, don't reset.
            // oddIndexCounter = 1;
        }

        System.out.println("Original sen: " + sentence);
        System.out.println("Modified sen: " + senBuilder.toString());
    }
}
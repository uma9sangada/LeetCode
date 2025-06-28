package strings.practice;

public class ReverseEachWord {

    public static void main(String[] args) {

        String s = "This is Automation testing";
        String reverseString = "";

        for (String word : s.split("\\s+")) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reverseString += reversedWord.toString() + " ";
        }
        System.out.println(reverseString.trim());
    }
}
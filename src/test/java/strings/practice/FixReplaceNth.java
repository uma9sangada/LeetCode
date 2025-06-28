package strings.practice;

public class FixReplaceNth {

    public static void main(String[] args) {
        String value = "Tomorrow";
        int count = 0, position = 2;
        char targetChar = 'o',replacementChar = '$';

        char[] charArray = value.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == targetChar) {
                count++;
                if (count == position) {
                    charArray[i] = replacementChar;
                    break; 
                }
            }
        }


        System.out.println("Original String: " + value);
        System.out.println("Modified String: " + new String(charArray));
    }
}
package java.strings;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0, j = 0;

        Set<Character> charSet = new HashSet<>();

        while (j < n) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j++));
                ans = Math.max(ans, charSet.size());
            } else {
                charSet.remove(s.charAt(i++));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength); }
}
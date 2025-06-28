package strings.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ReverseDuplicates {

	public static void main(String[] args) {
		String v = "good morning good chandra";
		LinkedHashSet<String> seenWords = new LinkedHashSet<>();
		String[] words = v.split("\\s+");

		for (String word : words) {
			if (!seenWords.add(word)) {

				System.out.println(v.replaceAll(word, new StringBuilder(word).reverse().toString()));

			}
		}

	}

}

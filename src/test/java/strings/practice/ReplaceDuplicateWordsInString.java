package strings.practice;

import java.util.*;

public class ReplaceDuplicateWordsInString {

    public static void main(String[] args) {

        String sent = "Sekhar uma Sekhar chandra",str="";
        Set<String> set = new LinkedHashSet<>();
        String[] splitsent = sent.split("\\s+"); 
        StringBuilder modifiedSent = new StringBuilder(sent);
        
        
        for (String word : splitsent) {
        	  if (!set.add(word)) {
        		  for (int i = word.length() - 1; i >= 0; i--) {
        				str += word.charAt(i);

        			}
        		  System.out.println(sent.replaceAll(word, str));
        	  }
        	
       
        }
        
        
        

//        for (String word : splitsent) {
//            if (!set.add(word)) {
//                StringBuilder build = new StringBuilder(word);
//                build.reverse();
//                String reversedWord = build.toString();
//               sent= sent.replaceAll(word, reversedWord);
//               
//            }
//        }
//        System.out.println(sent);
//    }
        
        
        
        
        
        
}}
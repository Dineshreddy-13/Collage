package exp9;

import java.util.*;
public class MaxOccurance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        scanner.close();
        String maxWord = findMaxOccurrenceWord(sentence);        
        if (maxWord != null) {
            String result = sentence.replaceAll("\\b" + maxWord + "\\b", "*");
            System.out.println("Modified sentence: " + result);
        } else {
            System.out.println("No words found in the sentence.");
        }
    }
    public static String findMaxOccurrenceWord(String sentence) {
        String[] words = sentence.split("\\s+");        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();  
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        String maxWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }        
        return maxWord;
    }
}


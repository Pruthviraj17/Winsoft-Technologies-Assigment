// Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;

public class NoOfWordsString {
    public static void main(String[] args) {
        String inputString = "I love programming in java, kotlin, dart";
        HashMap<String, Integer> wordCountMap = countWords(inputString);

        System.out.println("Word count: " + wordCountMap.size());
    }

    public static HashMap<String, Integer> countWords(String inputString) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = inputString.split("\\s+");

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        return wordCountMap;
    }
}

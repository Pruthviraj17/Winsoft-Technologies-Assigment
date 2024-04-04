// Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashSet;

public class DuplicateCharFinder {
    static HashSet<Character> findDuplicates(String str) {
        char[] chars = str.toCharArray();
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    uniqueChars.add(chars[i]);
                    break;
                }
            }
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        String inputString = "aabcdee fghiijkkkl";
        System.out.println(findDuplicates(inputString));
    }
}

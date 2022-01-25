package saikia.priyam.lib;

import java.util.Arrays;
import java.util.Locale;

public class StringProblems {
    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            Algo.print(str1 + " and " + str2 + " are not anagrams");
            return false;
        }
        char[] chars1 = str1.toLowerCase(Locale.ROOT).toCharArray();
        char[] chars2 = str2.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                Algo.print(str1 + " and " + str2 + " are not anagrams");
                return false;
            }
        }
        Algo.print(str1 + " and " + str2 + " are anagrams");
        return true;
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                Algo.print(str + " is not a palindrome");
                return false;
            }
        }
        Algo.print(str + " is a palindrome");
        return true;
    }

    public static void reverseString(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        Algo.print("Reverse String " + reverse);
    }

    public static void printDuplicates(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String repeatedChars = "";
        for (int i = 0; i < chars.length - 1; i++) {
            Algo.print(chars[i] + "");
            if (chars[i] == chars[i + 1] && !repeatedChars.contains(chars[i] + "")) {
                repeatedChars += chars[i] + "";
            }
        }
        Algo.print("Repeated characters " + repeatedChars);
    }
}

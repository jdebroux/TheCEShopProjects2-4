package org.theceshop;

public class Project2PalindromeChecker {

    public static Boolean checkStringForPalindrome(String input){
        return checkStringForPalindrome(input, false);
    }

    public static Boolean checkStringForPalindrome(String input, boolean isCaseSensitive) {
        if (!isCaseSensitive) {
            input = input.toLowerCase();
        }

        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

package com.exp;

public class Functions {
    public static String reverse(String text) {
        return new StringBuffer(text).reverse().toString();
    }

    public static int numVowels(String text) {
        String vowels = "aeiouAEIOU";
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                result++;
            }
        }
        return result;
    }

    public static String caps(String text) {
        return text.toUpperCase();
    }

    public static boolean palindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        if ((sb.reverse().toString()).equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}

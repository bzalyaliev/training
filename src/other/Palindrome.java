package other;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Palindrome {

    public static boolean toCheckPalindromeInterview(String inputWord) {

        char[] resultArrayOfWords = new char[inputWord.length()]; // char vs Character

        for (int i = 0; i < inputWord.length(); i++) {
            resultArrayOfWords[i] = inputWord.charAt(inputWord.length() - i - 1); // charAt()
        }
        String result = new String(resultArrayOfWords);
        // new String(arr)
        return result.equals(inputWord);
    }

    public static boolean isTextPalindrome(String text) {
        var chars = text.toLowerCase(Locale.ROOT).toCharArray();
        var left = 0;
        var right = chars.length - 1;
        while (left < right) {
            if (chars.[left] != chars[right])
        }
    }

    public static void main(String[] args) {

    }
}

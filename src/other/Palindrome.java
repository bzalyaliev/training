package other;

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

    public static void main(String[] args) {
        System.out.println(toCheckPalindromeInterview("ШАЛАШ"));

    }
}

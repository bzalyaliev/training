package hackerrank;

import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder result = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            char ch = A.charAt(i);
            result.append(ch);
        }
        if (A.equals(result.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}





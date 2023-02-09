package tink;

import java.util.Arrays;
import java.util.Scanner;


public class Cipher {

    public static void main(String[] args) {
        //String a = "1234??7890"; - YES
        //String a = "11223344550?2?4?6?80?6677889900"; - YES
        //String a = "0?2?4?6?802?"; - NO

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Boolean[] results = new Boolean[chars.length];

        for (int i = 0; i < chars.length; i++) {
            results[i] = a.indexOf(chars[i]) != -1;
        }

        if (Arrays.asList(results).contains(false)) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}

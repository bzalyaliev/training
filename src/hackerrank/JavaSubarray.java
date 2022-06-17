package hackerrank;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //length of array
        String length = scanner.nextLine();
        int lengthArray = Integer.parseInt(length);

        //string with numbers from CL -> array of numbers
        String array = scanner.nextLine();
        String[] arrInput = array.split(" ");
        int[] arr = new int[arrInput.length];
        for (int i = 0; i < arrInput.length; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        }

        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}





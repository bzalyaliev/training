package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaSubstringsComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        //List<String> nonOrder = new ArrayList<>();
        //List<String> lexicographicalOrder = new ArrayList<>();

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        /*Wrong way. Better to separate findMax and findMin
        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            //System.out.println(substring);
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
            else if (smallest.equals("") || substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
        }
         */


        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            //System.out.println(substring);
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (smallest.equals("") || substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
        }

        //nonOrder.add(substring);
        //lexicographicalOrder = nonOrder.stream().sorted().collect(Collectors.toList());
        //smallest = lexicographicalOrder.get(0);
        //largest = lexicographicalOrder.get(lexicographicalOrder.size() - 1);

        return smallest + "\n" + largest;
    }


    /**
     * @param str  - welcomejava
     * @param size - 3
     * @return - ["wel", "elc", ...]
     */

    public static List<String> split(String str, int size) {
        for (int i = 0; i <= str.length() - size; i++) {
            String substring = str.substring(i, i + size);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
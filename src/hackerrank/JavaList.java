package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>(numberOfElements);
        String a = scanner.nextLine();
        String[] strArr = a.split(" ");
        for (String s : strArr) {
            int lineItem = Integer.parseInt(s);
            list.add(lineItem);
        }

        int typeNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < typeNumber; i++) {
            String word = scanner.nextLine();
            if (Objects.equals(word, "Insert")) {
                String b = scanner.nextLine();
                String[] insertArr = b.split(" ");
                list.add(Integer.parseInt(insertArr[0]), Integer.parseInt(insertArr[1]));
            } else if (Objects.equals(word, "Delete")) {
                String c = scanner.nextLine();
                String[] deleteArr = c.split(" ");
                list.remove(Integer.parseInt(deleteArr[0]));
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}

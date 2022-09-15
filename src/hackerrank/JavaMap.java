package hackerrank;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = Integer.parseInt(scanner.nextLine());

        Map<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < numberOfEntries; i++) {
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            phoneBook.put(name, number);
        }

        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}


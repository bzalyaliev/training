package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        List<List<Integer>> lines = new ArrayList<>();
        List<List<Integer>> positions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //create List of the Lists from lines
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfLines; i++) {
            List<Integer> inner = new ArrayList<>();
            String a = scanner.nextLine();
            String[] strArr = a.split(" ");
            for (String s : strArr) {
                int lineItem = Integer.parseInt(s);
                inner.add(lineItem);
            }
            lines.add(inner);
        }

        //create List of the Lists with positions
        int numberOfPositions = Integer.parseInt(scanner.nextLine());
        for (int l = 0; l < numberOfPositions; l++) {
            List<Integer> innerPositions = new ArrayList<>();
            String positionsInput = scanner.nextLine();
            String[] positionsArr = new String[2];
            positionsArr = positionsInput.split(" ");
            for (String s : positionsArr) {
                int position = Integer.parseInt(s);
                innerPositions.add(position);
            }
            positions.add(innerPositions);
        }

        for (int i = 0; i < positions.size(); i++) {
            int xLine = positions.get(i).get(0); //line
            int yPosition = positions.get(i).get(1); //position

            int maxLinesSize = lines.get(xLine - 1).size();

            if (xLine <= numberOfLines & yPosition < maxLinesSize) {
                System.out.println(lines.get(xLine - 1).get(yPosition));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}



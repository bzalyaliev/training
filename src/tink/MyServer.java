package tink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyServer {

    private static int[] converterFromConsoleToArray(String inputNumbers) {

        String[] strArr = inputNumbers.split(" ");
        int[] inputProcessors = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            inputProcessors[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(inputProcessors));
        return inputProcessors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfProcessors = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        String inputNumbers = scanner2.nextLine();

        int[] processors = converterFromConsoleToArray(inputNumbers);
        Arrays.sort(processors);
        System.out.println(Arrays.toString(processors));

        int numberOfRows = processors.length;
        int numberOfColumns = processors[processors.length - 1];
        int[][] allFrequencies = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int k = 0; k < processors[i]; k++) {
                allFrequencies[i][k] = k + 1;
            }
        }

        List<Integer> cluster = new ArrayList<>();
        List<Integer> sumsCluster = new ArrayList<>();

        //int[] cluster = new int[numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            for (int k = 0; k < numberOfColumns; k++) {

                for (int m = 0; m < numberOfRows; m++) {
                    if ((allFrequencies[i + m + 1][k] % allFrequencies[i][k] == 0)) {
                        cluster.add(allFrequencies[i + m][k]);
                        cluster.add(allFrequencies[i + m + 1][k]);
                    }
                    else {

                    }
                }

            }
        }
    }
}

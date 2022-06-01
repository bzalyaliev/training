package hackerrank;

import java.io.*;
import java.util.*;


public class Java2DArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        System.out.println(arr);
        bufferedReader.close();


        /*
        (0;0), (0;1), (0;2)
        (1;1)
        (2;0), (2;1), (2;2)

        (i;j), (i;j+1), (i;j+2)
        (i+1;j+1)
        (i+2;j), (i+2;j+1), (i+2;j+2)

        если можно, то считаем часы: принимает массив, старт часов, возвращает сумму
        если нельзя, то ничего
        можно: j <= length - 2 и i <= length - 2

        (row; column)

        7 elements always

        */

        List<Integer> sumOfHourGlasses = new ArrayList<>();
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                sumOfHourGlasses.add(sum);
            }
        }

        System.out.println(sumOfHourGlasses);
        System.out.println(Collections.max(sumOfHourGlasses));


    }
}




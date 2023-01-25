package interviewbit;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimension = scanner.nextLine();
        String[] dimensionArr = dimension.split(" ");
        int N = Integer.parseInt(dimensionArr[0]);
        int M = Integer.parseInt(dimensionArr[1]);

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] lineArr = line.split(" ");
            for (int k = 0; k < M; k++) {
                arr[i][k] = Integer.parseInt(lineArr[k]);
            }
        }

        System.out.println(Arrays.deepToString(arr));


        int sum = 0;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                sum = arr[i][j];
                sum += sum;
            }
            System.out.print(sum);
            System.out.print(" ");
            sum = 0;
        }
    }
}

package javafromepam.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNumbersWithAndWithoutLineBreak {

    //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество случайных чисел");
        int amountOfRandomNumbers = scanner.nextInt();

        System.out.println("Введите максимальное случайное число, которое должно будет сгенерировано");
        int upperBound = scanner.nextInt();

        int[] arrayOfRandomNumbers = new int[amountOfRandomNumbers];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            int randomNumber = (int) (Math.random() * upperBound);
            arrayOfRandomNumbers[i] = randomNumber;
        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
        System.out.print(Arrays.toString(arrayOfRandomNumbers));


    }
}

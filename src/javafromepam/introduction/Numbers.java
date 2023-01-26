package javafromepam.introduction;

import java.util.*;

public class Numbers {

    public static void showEvenOddNumbers(Integer[] numbers) {
        List<Integer> resultEven = new ArrayList<>();
        List<Integer> resultOdd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                resultEven.add(number);
            } else {
                resultOdd.add(number);
            }
        }

        System.out.println("Чётные числа: " + resultEven);
        System.out.println("Нечётные числа: " + resultOdd);
    }

    public static void showMaxAndMinNumber(Integer[] numbers) {

        List<Integer> numbersList = Arrays.asList(numbers);
        int maxNumber = Collections.max(numbersList);
        int minNumber = Collections.min(numbersList);

        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);
    }

    public static void showNumbersThatAreDivisibleByThreeOrNine(Integer[] numbers) {
        List<Integer> numbersThatAreDivisibleByThreeOrNIne = new ArrayList<>();

        for (int number : numbers) {
            if (number % 3 == 0 | number % 9 == 0) {
                numbersThatAreDivisibleByThreeOrNIne.add(number);
            }
        }
        System.out.println("Числа, которые делятся на 3 или 9: " + numbersThatAreDivisibleByThreeOrNIne);
    }

    public static void showNumbersThatAreDivisibleByFiveAndSeven(Integer[] numbers) {
        List<Integer> numbersThatAreDivisibleByFiveAndSeven = new ArrayList<>();

        for (int number : numbers) {
            if (number % 5 == 0 & number % 7 == 0) {
                numbersThatAreDivisibleByFiveAndSeven.add(number);
            }
        }
        System.out.println("Числа, которые делятся на 5 и 7: " + numbersThatAreDivisibleByFiveAndSeven);
    }

    public static void showNumbersWithUniqueDigits(Integer[] numbers) {
        List<Integer> numbersWithUniqueDigits = new ArrayList<>();
        for (Integer number : numbers) {
            long result = number.toString().chars().distinct().count();
            if (result == 3) {
                numbersWithUniqueDigits.add(number);
            }
        }
        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр: " + numbersWithUniqueDigits);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        int amountOfNumbers = scanner.nextInt();
        Integer[] numbers = new Integer[amountOfNumbers];

        System.out.println("Введите числа");
        for (int i = 0; i < amountOfNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }

        showEvenOddNumbers(numbers);
        showMaxAndMinNumber(numbers);
        showNumbersThatAreDivisibleByThreeOrNine(numbers);
        showNumbersThatAreDivisibleByFiveAndSeven(numbers);
        showNumbersWithUniqueDigits(numbers);



    }
}

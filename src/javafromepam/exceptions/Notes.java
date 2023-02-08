package javafromepam.exceptions;

import java.util.Random;

public class Notes {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random random = new Random();

        for (int i = 0; i < 3200; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
                System.out.println("OK " + b + " " + c);
            }
            catch (ArithmeticException e) {
                System.out.println("Произошла ошибка, деление на 0");
                a = 0;
            }
            System.out.println(a);
        }
    }
}

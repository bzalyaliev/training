package exceptions;

import java.util.Random;

public class ExceptionsNotes {

    //Shildt
    public static void countWithExceptions() {
        Random random = new Random();
        int a, b, c = 0;

        for (int i = 0; i < 10; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 1000 / (b / c);
                System.out.println("b = " + b + " c = " + c + " a = " + a);
            } catch (ArithmeticException e) {
                System.out.println("Excpetion: " + e);
                a = 0;
            }
            System.out.println("Result a = " + a);
        }
    }

    public static void main(String[] args) {
        ExceptionsNotes.countWithExceptions();

    }
}

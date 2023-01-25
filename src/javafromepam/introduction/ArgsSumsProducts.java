package javafromepam.introduction;

import java.util.Arrays;

public class ArgsSumsProducts {

    /*
    Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения. Вывести результат на консоль.
    How to run.
    In the terminal from src:
    1. javac javafromepam/introduction/ArgsSumsProducts.java
    2. ArgsSumsProducts.class will be generate.
    3. java javafromepam.introduction.ArgsSumsProducts 1 2 3 4 5 6
     */


    public static void main(String[] args) {

        int sumArgs = 0;
        int productArgs = 1;

        for (String arg : args) {
            int argsElement = Integer.parseInt(arg);
            sumArgs += argsElement;
            productArgs *= argsElement;
        }

        System.out.println("Sum of the all arguments: " + sumArgs);
        System.out.println("Product of the all arguments: " + productArgs);
    }
}

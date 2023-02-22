package javafromepam.introduction;

import java.util.Arrays;


public class ReverseCommandLineArguments {

    /*
    Отобразить в окне консоли аргументы командной строки в обратном порядке
    How to run.
    In the terminal from src:
    1. javac main.java.com.github.bzalyaliev.javafromepam/introduction/ReverseCommandLineArguments.java
    2. ReverseCommandLineArguments.class will be generate.
    3. java main.java.com.github.bzalyaliev.javafromepam.introduction.ReverseCommandLineArguments Argument1 Argument2 Argument3 ArgsSumsProducts
     */

    public static void main(String[] args) {

        String[] reverseArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            reverseArgs[i] = args[args.length - i - 1];
        }
        System.out.println(Arrays.toString(reverseArgs));


    }
}

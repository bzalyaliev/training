package javafromepam.introduction;

import java.util.Scanner;

public class Password {
    //Ввести пароль из командной строки и сравнить его со строкой-образцом

    public static void main(String[] args) {

        String password = "my_password";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String passwordFromCommandLine = scanner.nextLine();

        if (passwordFromCommandLine.equals(password)) {
            System.out.println("Пароли совпадают");
        } else {
            System.out.println("Пароли не совпадают");
        }
    }
}

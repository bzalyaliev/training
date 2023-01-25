package javafromepam.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloUser {

    //Приветствовать любого пользователя при вводе его имени через командную строку.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = reader.readLine();
        System.out.println("Hello " + userName);
    }
}

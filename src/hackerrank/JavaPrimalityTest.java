package hackerrank;

import java.io.*;
import java.math.*;

import static java.util.stream.Collectors.joining;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger number = new BigInteger(String.valueOf(n));
        if (number.isProbablePrime(10)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}





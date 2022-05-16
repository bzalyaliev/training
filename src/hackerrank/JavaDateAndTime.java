package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaDateAndTime {

    public static void main(String[] args)  {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2004);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 29);
        calendar.add(Calendar.MONTH, -1);

        System.out.println(calendar.getTime());
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);

        String[] days = {"Zero", "Sunday", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        String result = days[dayOfWeek];
        System.out.println(result);
    }
}
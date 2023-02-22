package streams;



import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class MapAndFlatMap {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : numbers) {
            System.out.println(i * 2);
        }
        // map -> stream of the one type of data to another type of data
        //map создает одно (!) выходное значение для каждого входного значения
        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("petya", "kolya", "sasha");
        for (String name : names) {
            char[] nameChar = name.toCharArray();
            nameChar[0] = Character.toUpperCase(nameChar[0]);
            System.out.println(new String(nameChar));
        }

        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);

        String s = "abc";
        String s1 = new String("abc");
        System.out.println(s.equals(s1));
        System.out.println(s==s1);


    }


}

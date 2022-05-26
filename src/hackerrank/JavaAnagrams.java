package hackerrank;

import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        boolean result = true;
        Map<Character, Integer> mapForA = getCharacters(a);
        Map<Character, Integer> mapForB = getCharacters(b);

        /*[a: 1, b: 2]
          [h: 2, z: 1]
        */
        for (Map.Entry<Character, Integer> entry : mapForA.entrySet()) {
            result = mapForB.get(entry.getKey()).equals(entry.getValue());
        }
        return result;
    }

    private static Map<Character, Integer> getCharacters(String a) {
        char[] characters = a.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character character : characters) {
            // если уже есть ключ, то прибавляем единицу
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
                // Если нет, то кладем ключ и присваиваем значение 1
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}




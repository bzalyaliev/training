package hackerrank;

import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        boolean result = false;
        boolean resultFinal = true;
        Map<Character, Integer> mapForA = getCharacters(a);
        Map<Character, Integer> mapForB = getCharacters(b);
        List<Boolean> booleansResultSequence = new ArrayList<>();

        /*[a: 1, b: 2]
          [h: 2, z: 1]
        */
        for (Map.Entry<Character, Integer> entry : mapForA.entrySet()) {
            result = mapForB.get(entry.getKey()).equals(entry.getValue());
            booleansResultSequence.add(result);

        }
        System.out.println(booleansResultSequence);
        if (booleansResultSequence.contains(false)) {
            resultFinal = false;
        }
        return resultFinal;
    }


    private static Map<Character, Integer> getCharacters(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] characters = string.toCharArray();
        for (Character character : characters) {
            character = Character.toLowerCase(character);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
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




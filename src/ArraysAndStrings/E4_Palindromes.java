package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class E4_Palindromes {

    public static boolean isPalindrome(String input) {
        String lowerString = input.toLowerCase();
        Map<Character, Integer> map = getMap(lowerString);
        int counter = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> getMap(String input) {
        Map<Character, Integer> map = new HashMap<>(input.length());
        int lowerBoundValue = Character.getNumericValue('a');
        int upperBoundValue = Character.getNumericValue('z');
        for (char character : input.toCharArray()) {
            int charValue = Character.getNumericValue(character);
            if (charValue <= upperBoundValue && charValue >= lowerBoundValue) {
                if (map.containsKey(character)) {
                    map.put(character, map.get(character) + 1);
                    continue;
                }
                map.put(character, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String input = "ABBA";
        System.out.println(isPalindrome(input));
        input = "abba";
        System.out.println(isPalindrome(input));
        input = "abbae";
        System.out.println(isPalindrome(input));
        input = "&a@bb!a";
        System.out.println(isPalindrome(input));
        input = "abbaze";
        System.out.println(isPalindrome(input));
        input = "abbae zzzz ";
        System.out.println(isPalindrome(input));
    }

}

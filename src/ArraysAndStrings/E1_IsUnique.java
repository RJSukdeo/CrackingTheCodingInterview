package ArraysAndStrings;

import java.util.Arrays;

public class E1_IsUnique {

    public static boolean containsUniqueCharacters(String input) {
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == characters[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Ryan";
        System.out.println(containsUniqueCharacters(input));
        input = "Chantal";
        System.out.println(containsUniqueCharacters(input));
        input = "Chantall";
        System.out.println(containsUniqueCharacters(input));
        input = "Ryann";
        System.out.println(containsUniqueCharacters(input));
        input = "H@llo W@rd";
        System.out.println(containsUniqueCharacters(input));
    }

}

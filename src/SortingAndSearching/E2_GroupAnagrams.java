package SortingAndSearching;

import java.util.Arrays;
import java.util.Comparator;

public class E2_GroupAnagrams {

    public static void sort(String[] input) {
        Arrays.sort(input, new AnagramComparator());
    }

    private static class AnagramComparator implements Comparator<String> {

        private static String sortedString(String input) {
            char[] chars = input.toCharArray();
            Arrays.sort(chars);
            return String.valueOf(chars);
        }

        @Override
        public int compare(String s1, String s2) {
            return sortedString(s1).compareTo(sortedString(s2));
        }

    }

    public static void main(String[] args) {
        String[] input = new String[5];
        input[0] = "Hello";
        input[1] = "ABBA";
        input[2] = "Yeah";
        input[3] = "BABA";
        input[4] = "Heoll";
        sort(input);
        for (String element : input) {
            System.out.println(element);
        }
    }

}

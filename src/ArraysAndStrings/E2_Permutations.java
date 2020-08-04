package ArraysAndStrings;

import java.util.Arrays;

public class E2_Permutations {

    public static boolean arePermutations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        return Arrays.compare(c1, c2) == 0;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(arePermutations(s1, s2));
        s1 = "Hello";
        s2 = "olleH";
        System.out.println(arePermutations(s1, s2));
    }

}

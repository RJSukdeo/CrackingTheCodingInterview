package ArraysAndStrings;

import java.util.Arrays;

public class E9_StringRotation {

    public static boolean isSublist(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String adjustedString1 = String.valueOf(chars1);
        String adjustedString2 = String.valueOf(chars2);
        return adjustedString1.contains(adjustedString2);
    }

    public static void main(String[] args) {
        String input1 = "waterbottle";
        String input2 = "erbottlewat";
        System.out.println(isSublist(input1, input2));
    }

}

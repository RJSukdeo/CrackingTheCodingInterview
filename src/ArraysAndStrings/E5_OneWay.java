package ArraysAndStrings;

public class E5_OneWay {

    public static boolean mostOneEditDifferent(String input1, String input2) {
        if (Math.abs(input1.length() - input2.length()) > 1) {
            return false;
        }
        return compareChars(input1.toCharArray(), input2.toCharArray());
    }

    private static boolean compareChars(char[] chars1, char[] chars2) {
        if (chars1.length == chars2.length) {
            return doComparisonSameSize(chars1, chars2);
        }
        return doComparisonDifferentSize(chars1, chars2);
    }

    private static boolean doComparisonSameSize(char[] chars1, char[] chars2) {
        int difference = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                difference++;
                if (difference > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean doComparisonDifferentSize(char[] chars1, char[] chars2) {
        char[] smallerCollection;
        char[] largerCollection;
        if (chars1.length <= chars2.length) {
            smallerCollection = chars1;
            largerCollection = chars2;
        } else {
            smallerCollection = chars2;
            largerCollection = chars1;
        }
        int difference = 0;
        int counterSmaller = 0;
        int counterLarger = 0;
        while (counterSmaller < smallerCollection.length && counterLarger < largerCollection.length) {
            if (smallerCollection[counterSmaller] != largerCollection[counterLarger]) {
                difference++;
                if (difference > 1) {
                    return false;
                }
                counterLarger++;
                continue;
            }
            counterSmaller++;
            counterLarger++;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "pale";
        String input2 = "ple";
        System.out.println(mostOneEditDifferent(input1, input2));
        input1 = "pales";
        input2 = "pale";
        System.out.println(mostOneEditDifferent(input1, input2));
        input1 = "pale";
        input2 = "bale";
        System.out.println(mostOneEditDifferent(input1, input2));
        input1 = "pale";
        input2 = "bake";
        System.out.println(mostOneEditDifferent(input1, input2));
    }

}

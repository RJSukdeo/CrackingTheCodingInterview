package LinkedLists;

import java.util.LinkedList;

public class E6_Palindrome {

    public static boolean isPalindrome(LinkedList<Character> input) {
        while (input.size() > 1) {
            if (input.peekFirst() != input.peekLast()) {
                return false;
            }
            input.pollFirst();
            input.pollLast();
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(isPalindrome(getLinkedList(input)));
        System.out.println("");
        input = "ABBA";
        System.out.println(isPalindrome(getLinkedList(input)));
        System.out.println("");
        input = "ABCBA";
        System.out.println(isPalindrome(getLinkedList(input)));
        System.out.println("");
    }

    private static LinkedList<Character> getLinkedList(String input) {
        char[] chars = input.toCharArray();
        LinkedList<Character> result = new LinkedList<>();
        for (char aChar : chars) {
            result.add(aChar);
        }
        return result;
    }

}

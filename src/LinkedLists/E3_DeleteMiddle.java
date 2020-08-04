package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class E3_DeleteMiddle {

    public static void deleteMiddle(LinkedList<Integer> input) {
         if (input.size() <= 2) {
             System.out.println("Cannot perform delete middle action when size less than 2.");
             return;
         }
         int middleIndex = input.size()/2;
         input.remove(middleIndex);
    }

    public static void main(String[] args) {
        LinkedList input = getInput();
        deleteMiddle(input);
        printResults(input);
        deleteMiddle(input);
        printResults(input);
        deleteMiddle(input);
        printResults(input);
        deleteMiddle(input);
        printResults(input);
        deleteMiddle(input);
        printResults(input);
    }

    private static LinkedList<Integer> getInput() {
        LinkedList<Integer> input = new LinkedList<>();
        input.add(8);
        input.add(8);
        input.add(1);
        input.add(0);
        input.add(3);
        input.add(0);
        return input;
    }

    private static void printResults(LinkedList<Integer> input) {
        StringBuilder sb = new StringBuilder();
        ListIterator iterator = input.listIterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(" ");
        }
        System.out.println(sb);
        System.out.println("");
    }

}

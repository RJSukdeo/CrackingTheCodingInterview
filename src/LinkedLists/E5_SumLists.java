package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class E5_SumLists {

    public static LinkedList<Integer> addBackwardOrder(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        long sum1 = getNumberBackwardsOrder(l1);
        long sum2 = getNumberBackwardsOrder(l2);
        long result = sum1 + sum2;
        return getReversedLinkedList(result);
    }

    public static LinkedList<Integer> addForwardOrder(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        long sum1 = getNumberForwardOrder(l1);
        long sum2 = getNumberForwardOrder(l2);
        long result = sum1 + sum2;
        return getLinkedList(result);
    }

    private static long getNumberBackwardsOrder(LinkedList<Integer> input) {
        if (input.size() == 1) {
            return input.getFirst();
        }
        long mult = 1;
        long sum = 0;
        ListIterator<Integer> iterator = input.listIterator();
        while (iterator.hasNext()) {
            sum += mult * iterator.next();
            mult *= 10;
        }
        return sum;
    }

    private static long getNumberForwardOrder(LinkedList<Integer> input) {
        if (input.size() == 1) {
            return input.getFirst();
        }
        long mult = 1;
        long sum = 0;
        ListIterator<Integer> iterator = input.listIterator(input.size());
        while (iterator.hasPrevious()) {
            sum += mult * iterator.previous();
            mult *= 10;
        }
        return sum;
    }

    private static LinkedList<Integer> getReversedLinkedList(long input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        LinkedList<Integer> result = new LinkedList<>();
        for (char charElement : sb.toString().toCharArray()) {
            result.add((Character.getNumericValue(charElement)));
        }
        return result;
    }

    private static LinkedList<Integer> getLinkedList(long input) {
        String stringResult = String.valueOf(input);
        LinkedList<Integer> result = new LinkedList<>();
        for (char charElement : stringResult.toCharArray()) {
            result.add((Character.getNumericValue(charElement)));
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> input1 = new LinkedList<>();
        input1.add(7);
        input1.add(1);
        input1.add(6);
        LinkedList<Integer> input2 = new LinkedList<>();
        input2.add(5);
        input2.add(9);
        input2.add(2);
        printResult(addBackwardOrder(input1, input2));
        input1 = new LinkedList<>();
        input1.add(6);
        input1.add(1);
        input1.add(7);
        input2 = new LinkedList<>();
        input2.add(2);
        input2.add(9);
        input2.add(5);
        printResult(addForwardOrder(input1, input2));
    }

    private static void printResult(LinkedList<Integer> results) {
        ListIterator iterator = results.listIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(" ");
        }
        System.out.println(sb);
        System.out.println("");
    }

}

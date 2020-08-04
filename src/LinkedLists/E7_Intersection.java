package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class E7_Intersection {

    public static Integer intersects(LinkedList<Integer> input1, LinkedList<Integer> input2) {
        if (!getKthElement(input1, input1.size()).equals(getKthElement(input2, input2.size()))) {
            return null;
        }
        LinkedList<Integer> smallerList = input1.size() < input2.size() ? input1 : input2;
        LinkedList<Integer> largerList = input1.size() > input2.size() ? input1 : input2;
        ListIterator<Integer> smallerIterator = smallerList.listIterator();
        ListIterator<Integer> largerIterator = largerList.listIterator(largerList.size() - smallerList.size());
        while (smallerIterator.hasNext()) {
            int smallerElement = smallerIterator.next();
            int largerElement = largerIterator.next();
            if (smallerElement == largerElement) {
                return smallerElement;
            }
        }
        return null;
    }

    private static Integer getKthElement(LinkedList<Integer> input, int k) {
        ListIterator iterator = input.listIterator();
        int counter = 0;
        while (counter < k - 1) {
            iterator.next();
            counter++;
        }
        return (Integer) iterator.next();
    }

    public static void main(String[] args) {
        LinkedList<Integer> input1 = new LinkedList<>();
        input1.add(3);
        input1.add(1);
        input1.add(5);
        input1.add(9);
        input1.add(7);
        input1.add(2);
        input1.add(1);
        LinkedList<Integer> input2 = new LinkedList<>();
        input2.add(4);
        input2.add(6);
        input2.add(7);
        input2.add(2);
        input2.add(1);
        System.out.println(intersects(input1, input2));
    }

}

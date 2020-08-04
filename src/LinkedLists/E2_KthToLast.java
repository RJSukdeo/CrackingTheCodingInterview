package LinkedLists;

import java.util.LinkedList;

public class E2_KthToLast {

    public static void printKthToLast(LinkedList<Integer> input, int k) {
        if (input.size() < k) {
            System.out.println("Kth element larger than number of elements!!!");
            return;
        }
        StringBuilder sb = new StringBuilder(input.size() - k + 1);
        for (int i = k - 1; i < input.size(); i++) {
            sb.append(input.get(i)).append(" ");
        }
        System.out.println(sb.toString());
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList<Integer> input = getInput();
        printKthToLast(input, 1);
        printKthToLast(input, 6);
        printKthToLast(input, 5);
        printKthToLast(input, 3);
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
}

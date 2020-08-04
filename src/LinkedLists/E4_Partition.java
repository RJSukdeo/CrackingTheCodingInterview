package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class E4_Partition {

    public static LinkedList<Integer> partition(LinkedList<Integer> input, int partition) {
        int partitionIndex = getPartitionIndex(input, partition);
        LinkedList<Integer> result = new LinkedList<>();
        result.add(input.get(partitionIndex));
        input.remove(partitionIndex);
        ListIterator<Integer> iterator = input.listIterator();
        partitionIndex = 0;
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element < partition) {
                result.addFirst(element);
                partitionIndex++;
                continue;
            }
            result.addLast(element);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> input = getInput();
        LinkedList<Integer> result = partition(input, 1);
        printResults(result);
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

    private static int getPartitionIndex(LinkedList<Integer> input, int partition) {
        ListIterator<Integer> iterator = input.listIterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next() == partition) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private static void printResults(LinkedList<Integer> input) {
        ListIterator<Integer> iterator = input.listIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(" ");
        }
        System.out.println(sb);
        System.out.println("");
    }

}

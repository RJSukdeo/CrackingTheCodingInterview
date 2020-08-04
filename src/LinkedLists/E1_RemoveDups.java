package LinkedLists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class E1_RemoveDups {

    public static void removeDuplicates(LinkedList<Integer> input) {
        Map<Integer, Integer> map = new HashMap<>(input.size());
        ListIterator<Integer> iterator = input.listIterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (!map.containsKey(element)) {
                map.put(element, 1);
                continue;
            }
            iterator.remove();
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> input = getInput();
        removeDuplicates(input);
        ListIterator iterator = input.listIterator();
        StringBuilder sb = new StringBuilder(input.size());
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        System.out.println(sb.toString());
    }

    private static LinkedList<Integer> getInput(){
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

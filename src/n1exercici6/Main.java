package n1exercici6;

import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Integer> list_1 = new LinkedList<>();

        for (int i = 0; i < 20; i++)
         addInMiddle(list_1, i);

        list_1.listIterator().forEachRemaining(System.out::println);
    }

    private static void addInMiddle(List<Integer> linkedList, Integer integer){
        ListIterator<Integer> listIterator1 = linkedList.listIterator(linkedList.size()/2);
        listIterator1.add(integer);
    }
}

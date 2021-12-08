package n1exercici5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args){
        List<Integer> list_1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> list_2 = new ArrayList<>(11);

        ListIterator<Integer> listIterator1 = list_1.listIterator(list_1.size());
        ListIterator<Integer> listIterator2 = list_2.listIterator();
        while(listIterator1.hasPrevious()){
            listIterator2.add(listIterator1.previous());
        }
        list_2.listIterator().forEachRemaining(System.out::println);
    }
}

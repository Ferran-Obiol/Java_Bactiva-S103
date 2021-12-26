package n1exercici8;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("juan", 1);
        linkedHashMap.put("albert", 2);
        linkedHashMap.put("dani", 3);
        linkedHashMap.put("maria", 4);

        linkedHashMap.entrySet().iterator().forEachRemaining(System.out::println);

        OrderingClass.orderLinkedHashMap(linkedHashMap);

        linkedHashMap.entrySet().iterator().forEachRemaining(System.out::println);
    }



}

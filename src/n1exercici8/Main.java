package n1exercici8;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        orderLin
    }

    private static void orderLinkedHashMap(LinkedHashMap<String, Integer> linkedHashMap){
        List<Map.Entry<String,Integer>> arrayList = new ArrayList<>(linkedHashMap.entrySet());

        Collections.sort(arrayList, new NameComparator());
    }

    class NameComparator implements Comparator<Map.Entry<String, Integer>> {

        // override the compare() method
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getKey().compareTo(o2.getKey());
        }
    }

}

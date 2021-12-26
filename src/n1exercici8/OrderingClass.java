package n1exercici8;

import java.util.*;

public class OrderingClass {

    public static void orderLinkedHashMap(LinkedHashMap<String, Integer> linkedHashMap){
        List<Map.Entry<String,Integer>> arrayList = new ArrayList<>(linkedHashMap.entrySet());
        arrayList.sort(new NameComparator());
        linkedHashMap.clear();
        arrayList.forEach(stringIntegerEntry -> linkedHashMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
    }

    static class NameComparator implements Comparator<Map.Entry<String, Integer>> {

        // override the compare() method
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getKey().compareTo(o2.getKey());
        }
    }
}

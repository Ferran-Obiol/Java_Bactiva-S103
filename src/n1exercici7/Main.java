package n1exercici7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(48, "Forty-Eight");
        hashMap.put(2867, "Two thousands");
        hashMap.put(5555, "Five thousand");
        hashMap.put(3, "Three");

        System.out.println("Ordenem les parelles amb l'ajuda d'un TreeMap");
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(hashMap);
        for (Map.Entry<Integer, String> integerStringEntry : treemap.entrySet()) {
            System.out.println("Key: " + integerStringEntry.getKey() + " Value: " + integerStringEntry.getValue());
        }

        System.out.println("Creem un LinkedHashMap amb les parelles ordenades");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(treemap);
        linkedHashMap.entrySet().iterator().forEachRemaining(System.out::println);

        System.out.println("Creem un HashSet amb les claus ordenades");
        HashSet<Integer> hashSet = new HashSet<>(linkedHashMap.keySet());
        hashSet.stream().iterator().forEachRemaining(System.out::println);

        System.out.println("Creem un LinkedHashSet amb les claus ordenades");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(linkedHashMap.keySet());
        linkedHashSet.stream().iterator().forEachRemaining(System.out::println);



    }
}

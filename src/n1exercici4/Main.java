package n1exercici4;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args){
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        HashSet<Object> hashSet = new HashSet<>();
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Object> treeSet = new TreeSet<>();

        arrayList.add(new Month("February"));
        arrayList.add(new Month("January"));
        arrayList.add(new Month("March"));
        arrayList.add(new Month("December"));
        arrayList.add(new Month("March"));
        System.out.println("arrayList");
        iterate(arrayList);
        System.out.println();

        linkedList.add(new Month("February"));
        linkedList.add(new Month("January"));
        linkedList.add(new Month("March"));
        linkedList.add(new Month("December"));
        linkedList.add(new Month("March"));
        System.out.println("linkedList");
        iterate(linkedList);
        System.out.println();

        hashSet.add(new Month("February"));
        hashSet.add(new Month("January"));
        hashSet.add(new Month("March"));
        hashSet.add(new Month("December"));
        hashSet.add(new Month("March"));
        System.out.println("hashSet");
        iterate(hashSet);
        System.out.println();

        linkedHashSet.add(new Month("February"));
        linkedHashSet.add(new Month("January"));
        linkedHashSet.add(new Month("March"));
        linkedHashSet.add(new Month("December"));
        linkedHashSet.add(new Month("March"));
        System.out.println("linkedHashSet");
        iterate(linkedHashSet);
        System.out.println();

        treeSet.add(new Month("February"));
        treeSet.add(new Month("January"));
        treeSet.add(new Month("March"));
        treeSet.add(new Month("December"));
        treeSet.add(new Month("March"));
        System.out.println("Treeset");
        iterate(treeSet);
        System.out.println();
    }

    public static void iterate(Collection<?> collection){
        collection.iterator().forEachRemaining(System.out::println);
    }
}

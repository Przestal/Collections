package collections;

import helper.City;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("third");
        hashSet.add("fourth");
        hashSet.add("fifth");

        System.out.println("Is hashSet empty ? " + hashSet.isEmpty());
        System.out.println(hashSet);

        System.out.println("Is hashSet remove element?: " + hashSet.remove("third"));
        System.out.println(hashSet);
        System.out.println("Size of hashSet: " + hashSet.size());
        System.out.println("Has cointain first element? : " + hashSet.contains("first"));


        for (Object o : hashSet) {
            System.out.println(o);
        }
        hashSet.add("third");
        System.out.println("------------------------------");
        //hashSet.clear();
        //System.out.println(hashSet);


        HashSet hashSet1 = new HashSet();
        hashSet1.add("third");
        hashSet1.add("second");
        hashSet1.add("seventh");
        hashSet1.add("eighth");

        System.out.println("Hashset: " + hashSet);
        System.out.println("Hashset1: " + hashSet1);
        System.out.println("------------------------------");

        System.out.println("Compare cointains hashSet1 with hashSet: ");
        for (Object o : hashSet) {
            System.out.println(hashSet1.contains(o) ? "Yes" : "No");
        }

        System.out.println("------------------------------");


        HashSet hashSet2 = new HashSet();
        hashSet2 = (HashSet) hashSet1.clone();
        System.out.println("Hashset: " + hashSet);
        System.out.println("Hashset1: " + hashSet1);
        System.out.println("Hashset2: " + hashSet2);

        for (Object o : hashSet1) {
            System.out.println(hashSet2.contains(o) ? "Yes" : "No");
        }

        System.out.println("------------------------------");

        hashSet.retainAll(hashSet1);
        hashSet1.retainAll(hashSet2);
        System.out.println("RetainAll hs and hs1 " + hashSet);
        System.out.println("RetainAll hs1 and hs2 " + hashSet1);
        System.out.println("------------------------------");

        HashSet<City> cityHashSet = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            cityHashSet.add(new City("Cracow : " + i, 523));
        }

        Iterator<City> cityIterator = cityHashSet.iterator();
        while (cityIterator.hasNext()) {
            System.out.println(cityIterator.next());
        }
        System.out.println(cityHashSet.size());
        System.out.println("Add the same object, result:  " + cityHashSet.add(new City("Cracow : 1", 178)));
        System.out.println(cityHashSet.size());

    }
}

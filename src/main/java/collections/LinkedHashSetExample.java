package collections;

import helper.City;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetExample {


    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        int populactionCracow = 754056;

        lhs.add("A");
        lhs.add("B");
        lhs.add("C");

        System.out.println("Add another \"C\" " + lhs.add("C"));

        for (int i = 0; i < 15; i++) {
            lhs.add("H-" + i);
        }

        Iterator iterator = lhs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");

        LinkedHashSet<City> cityLHS = new LinkedHashSet<>();

        cityLHS.add(new City("Cracow", populactionCracow));
        cityLHS.add(new City("Warsaw", 1525562));
        cityLHS.add(new City("Gdansk", 302520));
        cityLHS.add(new City("Poznan", 320149));


        System.out.println("Size of objects: " + cityLHS.size());
        Iterator<City> cityIterator = cityLHS.iterator();
        while (cityIterator.hasNext()) {
            System.out.println(cityIterator.next());
        }
        System.out.println("Size: " + cityLHS.size());
        System.out.println("Add the same object, result boolean: " + cityLHS.add(new City("Cracow", populactionCracow)));
        System.out.println("Size: " + cityLHS.size());


    }


}

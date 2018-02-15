package collections;

import helper.City;
import helper.CustomComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<City> cityTreeSet = new TreeSet<>();

        System.out.println("Is treeSet empty? " + cityTreeSet.isEmpty());
        System.out.println("Size treeSet: " + cityTreeSet.size());


        for (int i = 1; i <= 100; i++) {
            City city = new City("City " + i);
            city.setPopulation((int) (Math.random() * 999) * 553);
            cityTreeSet.add(city);
        }

        City city = new City("City 199");
        city.setPopulation((int) (Math.random() * 999) * 553);
        cityTreeSet.add(city);

        Iterator<City> cityIterator = cityTreeSet.iterator();
        while (cityIterator.hasNext()) {
            City city1 = cityIterator.next();
            System.out.println(city1 + " -population- " + city1.getPopulation());
        }
        System.out.println("--------------------------------");
        System.out.println("First: " + cityTreeSet.first());
        System.out.println("Last: " + cityTreeSet.last());
        System.out.println("--------------Less Than- HeadSet-----------------");

        Iterator<City> headSetIterator = cityTreeSet.headSet(city).iterator();
        while (headSetIterator.hasNext()) {
            City city1 = headSetIterator.next();
            System.out.println(city1 + " population: " + city1.getPopulation());

        }
        System.out.println("-------------More Than- TailSet------------------");
        Iterator<City> tailSetIterator = cityTreeSet.tailSet(city).iterator();
        while (tailSetIterator.hasNext()) {
            City city1 = tailSetIterator.next();
            System.out.println(city1 + " population: " + city1.getPopulation());

        }

        System.out.println("\nNavigable Set Methods");
        System.out.println("Ceiling " + cityTreeSet.ceiling(city));
        System.out.println("Floor " + cityTreeSet.floor(city));
        System.out.println("Higher " + cityTreeSet.higher(city));
        System.out.println("Lower " + cityTreeSet.lower(city));

        System.out.println("\nCustomComparator");
        TreeSet<City> cityTreeSet1 = new TreeSet<>(new CustomComparator());
        cityTreeSet1.addAll(cityTreeSet);
        Iterator<City> cityIterator1 = cityTreeSet1.iterator();
        while (cityIterator1.hasNext()) {
            City city1 = cityIterator1.next();
            System.out.println(city1 + " population " + city1.getPopulation());
        }

        System.out.println("PollFirst: " + cityTreeSet.pollFirst());
        System.out.println("PollLast: " + cityTreeSet.pollLast());

        City subSetCity = new City("City 50k", 50000);
        City subSetCity1 = new City("City 80k", 80000);
        System.out.print(" " + cityTreeSet.subSet(subSetCity, true, subSetCity1, true));
    }


}

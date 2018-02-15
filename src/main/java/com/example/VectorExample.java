package com.example;

import helper.City;

import java.util.*;

public class VectorExample {


    public static void main(String[] args) {

        Vector<City> cityVector = new Vector<>(10, 5);

        System.out.println("Size :" + cityVector.size());

        System.out.println("Capacity before adding objects: " + cityVector.capacity());

        for (int i = 0; i < 11; i++) {
            cityVector.add(new City(" City" + i));
        }
        System.out.println("Capacity after added objects: " + cityVector.capacity());
        System.out.println("Size :" + cityVector.size());

        cityVector.add(5, new City(" Warsaw"));


        Iterator<City> cityIterator = cityVector.iterator();
        while (cityIterator.hasNext()) {
            System.out.print(cityIterator.next());
        }
        System.out.println("\nSize :" + cityVector.size());

        System.out.println("First element: " + cityVector.firstElement());

        System.out.println("Last element: " + cityVector.lastElement());

        System.out.println("-----Enumeration-----");
        Enumeration<City> cityEnumeration = cityVector.elements();
        while (cityEnumeration.hasMoreElements()) {
            System.out.print(cityEnumeration.nextElement());
        }
        System.out.println("\n----Clone------");

        Vector<City> cityVector1 = (Vector<City>) cityVector.clone();

        Iterator<City> cityIterator1 = cityVector1.iterator();

        while (cityIterator1.hasNext()) {

            System.out.print(" Clone" + cityIterator1.next());
        }
        System.out.println("\nCapacity: " + cityVector.capacity());

        ArrayList<City> cityArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            cityArrayList.add(new City("Berlin" + i));

        }

        System.out.println("\n----Add all elements of list to vector----");
        cityVector.addAll(cityArrayList);
        Iterator<City> cityIterator2 = cityVector.iterator();

        while (cityIterator2.hasNext()) {
            System.out.println(cityIterator2.next());
        }


        System.out.println("Capacity: " + cityVector.capacity());
        System.out.println("Size: " + cityVector.size());

        System.out.println("Does vector contains all list elements? " + cityVector.containsAll(cityArrayList));
        cityArrayList.add(new City("Poznan"));
        System.out.println("Does vector contains all list elements? " + cityVector.containsAll(cityArrayList));


        List<City> cityList = cityVector.subList(5, 12);
        System.out.println(cityList);
    }

}

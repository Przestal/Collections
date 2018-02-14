package com.example;

import helper.City;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<City> cityArrayList = new ArrayList<>();

        City city = new City("Cracow");
        cityArrayList.add(city);

        System.out.println("Size arrayList: " + cityArrayList.size());

        for (int i = 0; i < 5; i++) {
            cityArrayList.add(new City("N " + i));
        }

        cityArrayList.add(4, new City("Warsaw"));

        Iterator<City> cityIterator = cityArrayList.iterator();
        while (cityIterator.hasNext()) {
            System.out.println(cityIterator.next());
        }
        System.out.println("------------Clone ArrayList-----------------");
        ArrayList<City> cityArrayList1 = (ArrayList<City>) cityArrayList.clone();

        Iterator<City> cityIterator1 = cityArrayList1.iterator();
        while (cityIterator1.hasNext()) {
            System.out.println("Clone " + cityIterator1.next());
        }
        System.out.println("---------------------------");
        //contains method can't work without override equals method in City class

        System.out.println("Contain objects " + cityArrayList.contains(new City("Poznan")));
        System.out.println("Get by index: " + cityArrayList.get(5));


        if (cityArrayList.size() == 0) ; //bad practise
        if (cityArrayList.isEmpty()) ;// use it, good practise

        for (int i = 0; i < cityArrayList.size(); i++) {
        }//bad practise
        int n = cityArrayList.size();
        for (int i = 0; i < n; i++) {
        } // better practise to get the size in a local variable

        System.out.println("indexOf Object: " + cityArrayList.indexOf(new City("Warsaw")));


        ArrayList<City> cityArrayList2 = new ArrayList<>();
        cityArrayList2.ensureCapacity(300);//try with and without ensureCapacity
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            cityArrayList2.add(new City("T "+(i+10)));
        }

        System.out.println(System.nanoTime()-startTime);



    }


}

package collections;

import helper.City;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<City> cityLinkedList = new LinkedList<>();


        for (int i = 0; i < 100; i++) {
            cityLinkedList.add(new City("City" + i));
        }

        System.out.println("Size: " + cityLinkedList.size());

        cityLinkedList.removeFirst();
        cityLinkedList.removeLast();
        System.out.println("Size after remove: " + cityLinkedList.size());
        //adding objects moves the rest of objects by one index
        cityLinkedList.addFirst(new City("Cracow"));
        cityLinkedList.addLast(new City("Warsaw"));

        System.out.println("Size after add: " + cityLinkedList.size());

        Iterator<City> cityIterator = cityLinkedList.iterator();
        while (cityIterator.hasNext()) {
            System.out.println(cityIterator.next());
        }

        //fast way to delete first and last element
        cityLinkedList.pollFirst();
        cityLinkedList.pollLast();

        System.out.println("Get first: " + cityLinkedList.getFirst());
        System.out.println("Get last: " + cityLinkedList.getLast());

        System.out.println("-----------------");

        cityLinkedList.offer(new City("Poznan"));
        cityLinkedList.pop();
        Iterator<City> cityDescendingIterator = cityLinkedList.descendingIterator();
        while (cityDescendingIterator.hasNext()) {
            System.out.println(cityDescendingIterator.next());
        }


        System.out.println("Element: " + cityLinkedList.element());

    }
}

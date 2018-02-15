package collections;

import helper.City;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Spliterator;

public class ArrayDequeExample {


    public static void main(String[] args) {

        ArrayDeque<City> cityArrayDeque = new ArrayDeque<>();


        for (int i = 0; i < 30; i++) {
            City city = new City("C" + i);
            cityArrayDeque.offer(city);
            System.out.print(city + " ");
        }

        System.out.println("\n Size: " + cityArrayDeque.size());
        Spliterator<City> citySpliterator = cityArrayDeque.spliterator();
        citySpliterator.trySplit();

        //push in front
        cityArrayDeque.push(new City("Warsaw"));
        System.out.println("Get first: " + cityArrayDeque.getFirst());
        System.out.println("Get last: " + cityArrayDeque.getLast());
        System.out.println("Peek: " + cityArrayDeque.peek());
        System.out.println("Peek first: " + cityArrayDeque.peekFirst());
        System.out.println("Peek last: " + cityArrayDeque.peekLast());

        System.out.println("Poll: " + cityArrayDeque.poll());
        System.out.println("---Descending Iterator-------");
        Iterator<City> descendingIterator = cityArrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }

        System.out.println("\nPoll first: " + cityArrayDeque.pollFirst());
        System.out.println("Poll last: " + cityArrayDeque.pollLast());
        for (int i = 0; i < 3; i++) {
            cityArrayDeque.offer(new City("Warsaw"));
        }

        cityArrayDeque.removeFirstOccurrence(new City("Warsaw"));
        cityArrayDeque.removeFirstOccurrence(new City("Warsaw"));

        for (City city : cityArrayDeque) {
            System.out.print(city + " ");
        }


    }
}

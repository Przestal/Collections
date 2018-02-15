package collections;

import helper.City;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {


    public static void main(String[] args) {

        PriorityQueue<City> cityPriorityQueue = new PriorityQueue<>();


        for (int i = 0; i < 100; i++) {
            City city = new City("C" + i);
            city.setPopulation((int) ((Math.random() * 100) + 1));
            cityPriorityQueue.offer(city);
        }

        // peek()

        System.out.println(cityPriorityQueue.peek());

        Iterator<City> cityIterator = cityPriorityQueue.iterator();
        while (cityIterator.hasNext()) {
            City city = cityIterator.next();
            System.out.println(city + " population " + city.getPopulation());
        }


        City x = new City("C22");
        System.out.println("Contains method: " + x + " " + cityPriorityQueue.contains(x));

        //poll
        while (cityPriorityQueue.size() > 0) {
            City city = cityPriorityQueue.poll();
            System.out.println(city + " population " + city.getPopulation());
        }
        System.out.println("Size: " + cityPriorityQueue.size());


        //Thread safe priority queue
        Collection<City> threadSafe = Collections.synchronizedCollection(new PriorityQueue<City>());

    }
}

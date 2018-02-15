package map;

import helper.City;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<City, City> cityHashMap = new HashMap<>();

        System.out.println("Is hashMap empty?: " + cityHashMap.isEmpty());
        for (int i = 0; i < 100; i++) {
            cityHashMap.put(new City("W" + i), new City("C" + i, (int) (Math.random() * 658)));
        }
        System.out.println("Size: " + cityHashMap.size());

        /*Iterator<City> cityIterator = cityHashMap.keySet().iterator();
        while (cityIterator.hasNext()){
            City city = cityIterator.next();
            System.out.println(city+" number "+city);

        }*/

        Set<Map.Entry<City, City>> cityEntryMap = cityHashMap.entrySet();
        Iterator<Map.Entry<City, City>> entryIterator = cityEntryMap.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<City, City> cityCityEntry = entryIterator.next();
            System.out.println("Key: " + cityCityEntry.getKey() + " Value: " + cityCityEntry.getValue() + " Population: " +
                    cityCityEntry.getValue().getPopulation());
        }

        System.out.println("------Get method-------");
        System.out.println(cityHashMap.get(new City("W1")));
        System.out.println("------Print Values-----");
        System.out.println(cityHashMap.values());



    }
}

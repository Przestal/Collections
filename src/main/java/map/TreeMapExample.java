package map;

import com.sun.javafx.collections.MappingChange;
import helper.City;

import java.util.*;

public class TreeMapExample {


    public static void main(String[] args) {
        TreeMap<City, City> treeMap = new TreeMap<>();

        for (int i = 0; i < 100; i++) {
            City city = new City("City "+ i);
            city.setPopulation((int) ((Math.random()*985)+659));

            treeMap.put(new City("c"+i), city );

        }
        mapIterator(treeMap);
        System.out.println("First Entry: "+treeMap.firstEntry());
        System.out.println("First Key: "+treeMap.firstKey());
        System.out.println("Last Entry: "+treeMap.lastEntry());
        System.out.println("Last Key: "+treeMap.lastKey());


        System.out.println("First pollEntry "+treeMap.pollFirstEntry());
        System.out.println("Last pollEntry "+treeMap.pollLastEntry());

        System.out.println("Highter Entry: "+ treeMap.higherEntry(new City("Country 65")));
        System.out.println("Lower Entry: "+ treeMap.lowerEntry(new City("Country 65")));

    }

    public static void mapIterator(Map<City, City> treeMap){

        Iterator<Map.Entry<City, City>> map = treeMap.entrySet().iterator();
        while (map.hasNext()){
            Map.Entry<City, City> cityEntry = map.next();
            System.out.println("Key "+cityEntry.getKey() +
            " Value "+cityEntry.getValue()+" Population "+cityEntry.getValue().getPopulation());


        }


    }
}

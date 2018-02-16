package map;

import helper.City;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<String, City> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Poland", new City("Wroclaw"));
        linkedHashMap.put("Poland", new City("Szczecin"));
        linkedHashMap.put("Poland", new City("Opole"));
        linkedHashMap.put("Poland", new City("Katowice"));
        linkedHashMap.put("Germany", new City("Berlin"));
        linkedHashMap.put("United Kingdom", new City("London"));

        System.out.println(linkedHashMap);
        System.out.println("Get value from key: " + linkedHashMap.get("Germany"));
        System.out.println("Is contains value? " + linkedHashMap.containsValue(new City("London")));
        System.out.println("Size: " + linkedHashMap.size());
        System.out.println("Is map empty?: " + linkedHashMap.isEmpty());
        System.out.println("Is contains key? " + linkedHashMap.containsKey("Japan"));
        System.out.println("Delete element: " + linkedHashMap.remove("Poland"));
        System.out.println(linkedHashMap);


        Set<Map.Entry<String, City>> mapSet = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, City>> entryIterator = mapSet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, City> city = entryIterator.next();
            System.out.println("Key: " + city.getKey() + " --Value: " + city.getValue());
        }
        System.out.println("--------------------------------------");
        linkedHashMap.put("France", new City("Paris", 1655850));
        linkedHashMap.put("Portugal", new City("Porto", 896103));
        linkedHashMap.put("Ukraine", new City("Kiev", 251009));

        Iterator<Map.Entry<String, City>> iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, City> cityEntry = iterator.next();
            if (cityEntry.getValue().getPopulation() <= 0) {
                System.out.println("Key: " + cityEntry.getKey() + " --Value: " +
                        cityEntry.getValue() + " *population  no data" );
            } else {
                System.out.println("Key: " + cityEntry.getKey() + " --Value: " +
                        cityEntry.getValue() + " *population " + cityEntry.getValue().getPopulation());
            }
        }


    }


}

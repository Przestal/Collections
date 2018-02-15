package map;

import helper.City;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, City> cityHashSet = new HashMap<>();

        System.out.println("Is hashMap empty?: "+cityHashSet.isEmpty());
        for (int i = 0; i < 100; i++) {
            cityHashSet.put(i,new City("C"+i));
        }
        System.out.println("Size: "+cityHashSet.size());

        Iterator<Map.Entry<Integer,City>> c = cityHashSet.entrySet().iterator();
        while (c.hasNext()){
            System.out.println(c.next());
        }

    }
}

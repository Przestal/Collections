package com.example;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetExample {


    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("A");
        lhs.add("B");
        lhs.add("C");

        System.out.println("Add another \"C\" " + lhs.add("C"));

        for (int i = 0; i < 15; i++) {
            lhs.add("H-" + i);
        }

        Iterator iterator = lhs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


}

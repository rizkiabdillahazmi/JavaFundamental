package com.prodemy.day06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestingHashSet {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Apel");
        hset.add("Mangga");
        hset.add("Jeruk");
        hset.add("Melon");
        hset.add("Pisang");
        hset.add("Pisang");
        // hset.add(null);

        // Menghapus semua item
        // hset.clear()
        System.out.println(hset);

        Iterator<String> it = hset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Iterate without Iterator :");
        for (String temp : hset) {
            System.out.println(temp);
        }

        // Creating a TreeSet of HashSet elements
        Set<String> tset = new TreeSet<String>(hset);
        System.out.println("Tree Set Contain :");
        for (String temp : tset) {
            System.out.println(temp);
        }
    }
}

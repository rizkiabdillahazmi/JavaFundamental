package com.prodemy.day06;

import java.util.HashMap;
import java.util.Map;

public class TestingHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Januari");
        hmap.put(2, "Februari");
        hmap.put(3, "Maret");
        hmap.put(4, "April");
        hmap.put(5, "Mei");
        hmap.put(6, "Juni");
        hmap.put(7, "Juli");
        hmap.put(8, "Agustus");
        hmap.put(9, "September");
        hmap.put(10, "Oktober");
        hmap.put(11, "November");
        hmap.put(12, "Desember");

        System.out.println(hmap.get(6));
        System.out.println(hmap.containsValue("November"));
        System.out.println(hmap.containsKey(5));
        System.out.println(hmap.keySet());
        // replace(), size(), remove()

        for (Map.Entry<Integer, String> me : hmap.entrySet()) {
            System.out.println("Key : " + me.getKey() + " & Value : " + me.getValue());
        }
    }
}

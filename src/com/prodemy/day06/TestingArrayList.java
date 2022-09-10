package com.prodemy.day06;

import java.util.ArrayList;
import java.util.Collections;

public class TestingArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Rizki");
        arrayList.add("Joni");
        arrayList.add("Eko");
        arrayList.add("Abdillah");
        arrayList.add(0, "Azmi");

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);

        arrayList.remove(0);
        arrayList.remove("Abdillah");

        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}

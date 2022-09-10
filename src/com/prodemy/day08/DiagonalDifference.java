package com.prodemy.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<Integer>(Arrays.asList(10, 8, -12)));
        // List<Integer> list = new ArrayList<>();
        // list.addAll(Arrays.asList(1, 2, 3));
        // list.addAll(Arrays.asList(2, 5, 7));
        // list.addAll(Arrays.asList(5, 8, -1));
        // arr.add(list);
        // System.out.println(arr);
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count += arr.get(i).get(i) - arr.get(i).get(arr.size() - i - 1);
        }
        System.out.println(Math.abs(count));
    }
}

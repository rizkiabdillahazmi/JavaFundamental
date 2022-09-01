package com.prodemy.day03;

import java.util.Arrays;

public class SortingArray {
    private static int[] array = new int[] { 9, 9, 34, 2, 8, -3, -90, -80, 11, 26, 7, 0, 20};

    public static void main(String[] args) {
        System.out.println("Ascending array sort :");
        ascSort();
        System.out.println("\n\nDescending array sort :");
        descSort();
    }

    private static void ascSort() {
        boolean swapped = true;
        int tmp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                    // System.out.println(Arrays.toString(array));

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void descSort() {
        boolean swapped = true;
        int tmp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
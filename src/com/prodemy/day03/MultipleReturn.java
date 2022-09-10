package com.prodemy.day03;

public class MultipleReturn {
    public static void main(String[] args) {
        int[] value = returnMultiple();
        System.out.println(value);
    }

    private static int[] returnMultiple() {
        int val[] = new int[2];
        val[0] = 3;
        val[1] = 5;
        return val;
    }
}

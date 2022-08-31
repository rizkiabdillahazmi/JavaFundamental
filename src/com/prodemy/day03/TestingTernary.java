package com.prodemy.day03;

public class TestingTernary {
    public static void main(String[] args) {
        int n1 = 5, n2 = 10, max;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        
        // Ternary
        max = (n1 > n2) ? n1 : n2;
        System.out.println("Maximum is = " + max);
    }
}

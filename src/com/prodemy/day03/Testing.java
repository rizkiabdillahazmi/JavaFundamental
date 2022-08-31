package com.prodemy.day03;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        InnerTesting it = new InnerTesting();
        it.printMethod();
    }
}

/**
 * InnerTesting
 */
class InnerTesting {
    public void printMethod() {
        System.out.println("Tes");
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
    }
}

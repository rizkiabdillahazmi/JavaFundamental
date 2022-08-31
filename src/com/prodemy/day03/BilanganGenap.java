package com.prodemy.day03;

import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args) {
        bilanganGenap();
    }

    private static void bilanganGenap() {
        System.out.print("Masukkan Jumlah Bilangan Genap yang ingin ditampilkan : ");
        Scanner scanner = new Scanner(System.in);
        int jumlah = scanner.nextInt();

        int i = 1;
        int count = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }    
            i++;
        } while (count < jumlah);
    }
}

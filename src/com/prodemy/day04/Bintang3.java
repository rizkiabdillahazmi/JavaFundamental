package com.prodemy.day04;

import java.util.Scanner;

public class Bintang3 {
    public static void main(String[] args) {
        System.out.print("Masukkan Bilangan : ");
        Scanner sc = new Scanner(System.in);
        bilangan(sc.nextInt());
    }

    private static void bintang() {
        int n = 9;
        for (int baris = 0; baris < n; baris++) {
            for (int kolom = 0; kolom <= n; kolom++) {
                String cetak = (baris==kolom) ? "*":"  ";
                System.out.print(cetak);
            }
            System.out.println();
        }
    }

    private static void bilangan(int n) {
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                if (baris==kolom) {
                    System.out.print(baris);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

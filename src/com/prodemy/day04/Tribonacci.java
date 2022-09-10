package com.prodemy.day04;

import java.util.Scanner;

import com.prodemy.util.StringUtil;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cetakTribonacciMirror(n);
    }

    private static void cetakTribonacci(int n) {
        int[] bilangan = new int[n];
        for (int i = 0; i < n; i++) {
            int tribonacci = (i < 3) ? 1 : bilangan[i - 1] + bilangan[i - 2] + bilangan[i - 3];
            bilangan[i] = tribonacci;
        }

        for (int baris = 1; baris <= n ; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                String cetak = (baris == (n+1)/2) ? String.valueOf(bilangan[kolom-1]) : (kolom == (n+1)/2) ? String.valueOf(bilangan[baris-1]) : " ";
                System.out.print(StringUtil.pad(cetak, 3));
            }
            System.out.println();
        }
    }

    private static void cetakTribonacciMirror(int n) {
        int[] bilangan = new int[n];
        for (int i = 0; i < n; i++) {
            bilangan[i] = (i<3) ? bilangan[i] = 1 : (i<=(n-1)/2) ? bilangan[i - 1] + bilangan[i - 2] + bilangan[i - 3] : bilangan[n-i-1];
        }

        for (int baris = 1; baris <= n ; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                if (baris == (n+1)/2) System.out.print(StringUtil.pad(bilangan[kolom-1], 3));
                else if (kolom == (n+1)/2) System.out.print(StringUtil.pad(bilangan[baris-1], 3));
                else System.out.print(StringUtil.pad(" ", 3));
            }
            System.out.println();
        }
    }
}

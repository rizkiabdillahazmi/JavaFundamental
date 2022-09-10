package com.prodemy.day04;

import java.util.Scanner;

import com.prodemy.util.StringUtil;

public class Bintang4 {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if (n % 2 == 0) {
        //     System.out.println("Anda Memasukkan Bilangan Genap !!!");
        // } else {
        //     bintang(n);
        //     cetakBilanganGanjil(n);
        // }
        // cetakFibonacci(n);
    }

    private static void bintang(int n) {
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                String cetak = (baris == kolom || baris == n - kolom + 1) ? "* " : "  ";
                System.out.print(cetak);
            }
            System.out.println();
        }
    }

    private static void cetakBilangan(int n) {
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                String cetak = (baris == kolom || baris == n - kolom + 1) ? String.valueOf(kolom) + " " : "  ";
                System.out.print(cetak);
            }
            System.out.println();
        }
    }

    private static void cetakBilanganGanjil(int n) {
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                String cetak = (baris==kolom || baris==n-kolom+1) ? String.valueOf((kolom-1)*2+1)+" " : "  ";
                System.out.print(cetak);
            }
            System.out.println();
        }
    }

    private static void cetakFibonacci(int n) {
        int[] bilangan = new int[n];
        for (int i = 0; i < n; i++) {
            int fibonacci = (i < 2) ?  1 : bilangan[i-1]+bilangan[i-2];
            bilangan[i] = fibonacci;
        }

        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                String cetak = (baris==kolom || baris==n-kolom+1) ? String.valueOf(bilangan[kolom-1])+" " : "  ";
                System.out.print(StringUtil.pad(cetak, 3));
            }
            System.out.println();
        }
    }

}

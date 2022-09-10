package com.prodemy.day05;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.prodemy.util.StringUtil;

public class TribonacciMirror {
    public static void main(String[] args) {
        
        boolean ulang = true;
        while (ulang) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan bilangan : ");
                int n = sc.nextInt();
                cetakTribonacciMirror(n);
                ulang = false;
            } catch (Exception e) { // Misal gak tau exception apa maka tulis aja  "Exception"
                System.err.println(e);
                System.err.println("Masukan Harus Angka !!");
                // sc.nextLine();
            } finally {
                System.out.println("Tes");
            }
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

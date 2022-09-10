package com.prodemy.day04;

import com.prodemy.util.StringUtil;

public class Testing {
    public static void main(String[] args) {
        int n = 7;
        tribonacci(n);
    }

    private static void tribonacci(int n) {
        int[] tribonacci = new int[n];
        for (int i = 0; i < tribonacci.length; i++) {
            int bilangan = (i < 3) ? 1 : tribonacci[i-1] + tribonacci[i-2] + tribonacci[i-3];
            tribonacci[i] = bilangan;
        }
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
               String cetak = (kolom==(n+1)/2)? String.valueOf(tribonacci[baris-1]) : (baris == (n+1)/2) ? String.valueOf(tribonacci[kolom-1]) : " ";
               System.out.print(StringUtil.pad(cetak, 3));
            }
            System.out.println();
        }
    }
}

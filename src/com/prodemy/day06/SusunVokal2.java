package com.prodemy.day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class SusunVokal2 {
    static char[] vokals = new char[] { 'a', 'e', 'i', 'u', 'o' };
    static String kalimat = "";
    static Collection<HurufVokal> hurufCollection = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Masukkan Kalimat : ");
        Scanner sc = new Scanner(System.in);
        kalimat = sc.nextLine().toLowerCase();

        for (int i = 0; i < kalimat.length(); i++) {
            tambah(kalimat.charAt(i));
        }

        for (HurufVokal hv : hurufCollection) {
            System.out.print(hv);
        }
    }

    public static void tambah(char huruf) {
        boolean ditemukan = false;
        for (HurufVokal hv : hurufCollection) {
            if (hv.vokal == huruf) {
                hv.jumlah++;
                ditemukan = true;
            }
        }

        if (!ditemukan && apakahHurufVokal(huruf)) {
            HurufVokal hv = new HurufVokal();
            hv.vokal = huruf;
            hv.jumlah = 1;
            hurufCollection.add(hv);
        }
    }

    static boolean apakahHurufVokal(char huruf) {
        for (char vokal : vokals) {
            if (vokal == huruf)
                return true;
        }
        return false;
    }

    static class HurufVokal {
        char vokal;
        int jumlah = 0;

        @Override
        public String toString() {
            String word = "";
            for (int i = 0; i < jumlah; i++) {
                word += vokal;
            }
            return word;
        }
    }

}
package com.prodemy.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class SusunVokal {
    static char[] vokals = new char[] { 'a', 'e', 'i', 'u', 'o' };

    static ArrayList<Character> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Masukkan Kalimat : ");
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine().toLowerCase();

        for (int i = 0; i < kalimat.length(); i++) {
            tambah(kalimat.charAt(i));
        }
        for (char output : list) {
            System.out.print(output);
        }
    }

    private static void tambah(char huruf) {
        if (list.contains(huruf)) {
            list.add(list.indexOf(huruf), huruf);
        }
        for (char vokal : vokals) {
            if (huruf == vokal && list.contains(huruf) == false) {
                list.add(huruf);
            }
        }
    }

}

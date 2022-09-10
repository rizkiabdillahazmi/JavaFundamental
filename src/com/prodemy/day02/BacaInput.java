package com.prodemy.day02;
import java.util.Scanner;

public class BacaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        int pertama = sc.nextInt();
        System.out.printf("Angka Pertama adalah %d\n", pertama);

        System.out.print("Masukkan Angka Kedua : ");
        int kedua = sc.nextInt();
        System.out.printf("Angka Kedua adalah %d\n", kedua);
    }
}

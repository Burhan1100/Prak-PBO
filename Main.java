package com.company;

import java.io.StringReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x,o=1,pilih;
        float jumlah = 0;
        String nama;
        int maks = 0;
        int min = 100;

                System.out.print("Masukan Nama Anda : ");
                nama = scan.nextLine();

                System.out.print("Berapa nilai yang ingin di Input : ");
                x = scan.nextInt();

                int angka[] = new int[x];

                for (int i = 0; i < x; i++) {
                    System.out.print("Nilai ke [" + o + "] = ");
                    angka[i] = scan.nextInt();
                    o++;
                }

                for (int i = 0; i < x; i++) {
                    jumlah += angka[i];
                    if (maks < angka[i]) {
                        maks = angka[i];
                    }
                    if (min > angka[i]) {
                        min = angka[i];
                    }
                }
                System.out.println();
                System.out.println("Nama : " + nama);
                System.out.println("Nilai Tertinggi : " + maks);
                System.out.println("Nilai Terendah : " + min);
                System.out.println("Rata-Rata : " + jumlah / x);


    }
}





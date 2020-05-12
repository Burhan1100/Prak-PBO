/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_pbo;
import java.util.Scanner;
/**
 *
 * @author Burhan
 */
public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int jumlah;
        String nama,nim;
        int tesTulis,tesCoding,tesWawancara,tesMicroteaching,tesJaringan;
        String kembali;
        
        
        do {
            try{
                System.out.println("MENU PENDAFTARAN");
                System.out.println("1. Asisten Lab");
                System.out.println("2. Admin Lab");
                System.out.print("Pilih Menu :");
                int pilih = input.nextInt();
                
                switch(pilih) {
                    case 1 :
                        System.out.println("\n--------Pendaftaran Asisten Lab--------");
                        System.out.println("Berapa banyak yang mendaftar : ");
                        jumlah = input.nextInt();
                        for (int p=0; p<jumlah; p++){
                            input.nextLine();
                            System.out.print("Input Nim : ");
                            nim = input.nextLine();
                            System.out.print("Input Nama : ");
                            nama = input.nextLine();
                            System.out.print("Input Nilai Tes Tulis : ");
                            tesTulis = input.nextInt();
                            System.out.print("Input Nilai Tes Coding : ");
                            tesCoding = input.nextInt();
                            System.out.print("Input Nilai Tes Wawancara : ");
                            tesWawancara = input.nextInt();
                            System.out.print("Input Nilai Tes Microteaching : ");
                            tesMicroteaching = input.nextInt();
                            AsistenLab aslab = new AsistenLab (nama,nim,tesTulis,tesCoding,tesWawancara,tesMicroteaching);
                            aslab.lihatAkhir();
                            System.out.println();
                        }
                        break;
                    case 2 :
                        System.out.println("--------\n Pendaftaran Admin Lab----------");
                        System.out.println("Berapa banyak yang mendaftar  : ");
                        jumlah = input.nextInt();
                        for (int p=0; p<jumlah; p++){
                            input.nextLine();
                            System.out.print("Input Nim Pendaftar : ");
                            nim = input.nextLine();
                            System.out.print("Input Nama Pendaftar : ");
                            nama = input.nextLine();
                            System.out.print("Input Nilai Tes Tulis : ");
                            tesTulis = input.nextInt();
                            System.out.print("Input Nilai Tes Coding : ");
                            tesCoding = input.nextInt();
                            System.out.print("Input Nilai Tes Wawancara : ");
                            tesWawancara = input.nextInt();
                            System.out.print("Input Nilai Tes Jaringan : ");
                            tesJaringan = input.nextInt();
                            AsistenLab admin= new AsistenLab (nama,nim,tesTulis,tesCoding,tesWawancara,tesJaringan);
                            admin.lihatAkhir();
                            System.out.println();
                        }
                        break;
                }
        } catch (Exception e2){
                System.err.println(" Ulangi!!");
        } finally {
                input.nextLine();
                System.out.print("\nKembali ke menu ? (y/n) : ");
                kembali= input.nextLine();
                System.out.println("");
            }
            
    } while (kembali.equals("y"));
    }
}
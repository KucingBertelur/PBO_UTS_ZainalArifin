/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal;

import java.util.Scanner;

/**
 *
 * @author sutri
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan : ");
        int pilih = scan.nextInt();
        switch(pilih){
            case 1 -> {
                System.out.print("Masukkan Panjang sisi persegi : ");
                int sisi1 = scan.nextInt();
                System.out.println("Luas Persegi adalah : "+sisi1*sisi1+"cm");
            }
            case 2 -> {
                System.out.print("Masukkan Panjang sisi persegi : ");
                int sisi2 = scan.nextInt();
                System.out.println("Keliling Persegi adalah : "+sisi2*4+"cm");
            }
            default -> System.out.println("Sistem Erorr");
        }
    }
}
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
public class Soal2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bulan ke- = ");
        int bulan = input.nextInt();
        
        switch (bulan){
            case 1 -> System.out.println("Bulan ke-" + bulan + " adalah Januari");
            case 2 -> System.out.println("Bulan ke-" + bulan + " adalah Februari");
            case 3 -> System.out.println("Bulan ke-" + bulan + " adalah Maret");
            case 4 -> System.out.println("Bulan Ke-" + bulan + " adalah April");
            case 5 -> System.out.println("Bulan ke-" + bulan + " adalah Mei");
            case 6 -> System.out.println("Bulan ke-" + bulan + " adalah Juni");
            case 7 -> System.out.println("Bulan Ke-" + bulan + " adalah Juli");
            case 8 -> System.out.println("Bulan Ke-" + bulan + " adalah Agustus");
            case 9 -> System.out.println("Bulan Ke-" + bulan + " adalah September");
            case 10 -> System.out.println("Bulan Ke-" + bulan + " adalah Oltober");
            case 11 -> System.out.println("Bulan Ke-" + bulan + " adalah November");
            case 12 -> System.out.println("Bulan Ke-" + bulan + " adalah Desember");
            default -> System.out.println("Tidak ada Bulan ke-" + bulan);
        }
    }
}


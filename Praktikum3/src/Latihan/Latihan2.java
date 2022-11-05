package Latihan;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Total Belanja : RP.");
        int belanja = scan.nextInt();
         if (belanja > 100000){
             System.out.println("Selamat, anda mendapatkan diskon !");
         }
         System.out.println("Terima Kasih Telah Berbelanja di ZA CELL");
    }
}


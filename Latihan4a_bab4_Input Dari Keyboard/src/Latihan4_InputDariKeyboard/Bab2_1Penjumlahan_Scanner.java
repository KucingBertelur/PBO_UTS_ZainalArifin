/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan4_InputDariKeyboard;

import java.util.Scanner;

/**
 *
 * @author sutri
 */
public class Bab2_1Penjumlahan_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);

    System.out.print("Masukkan Nilai A = ");
    int nilai1 = s1.nextInt();
    
    System.out.print("Masukkan Nilai B = ");
    int nilai2 = s1.nextInt();
    
    System.out.println("Nilai A = "+ nilai1);
    System.out.println("Nilai B = "+ nilai2);
    int jumlah = nilai1 + nilai2;
    System.out.println("Jumlah = " + jumlah);
    }    
}
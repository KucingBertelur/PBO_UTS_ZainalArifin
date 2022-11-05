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
public class Bab1_1Biodata_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Buat scanner
    Scanner s1 = new Scanner(System.in);
    // Ambil nilai dari keyboard
    System.out.print("Masukkan Nama\t = ");
    String nilai1 = s1.nextLine();
    
    System.out.print("Masukkan NIM\t = ");
    int nilai2 = s1.nextInt();
    
    System.out.print("Masukkan Alamat\t = ");
    String nilai3 = s1.next();
   
    // Hitung dan Print
    String jumlah = nilai1 + nilai2 + nilai3;
    System.out.println("Jumlah\t = " + jumlah);
    }    
}
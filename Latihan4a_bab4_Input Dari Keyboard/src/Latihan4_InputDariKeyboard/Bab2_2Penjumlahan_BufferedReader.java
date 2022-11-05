package Latihan4_InputDariKeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class Bab2_2Penjumlahan_BufferedReader {
    public static void main(String[] args) {
        //Buat Buffer Reader
        BufferedReader br1 = new BufferedReader (new
        InputStreamReader(System.in));
        
            try {
                System.out.print("Nilai A = ");
                int nilai1 = Integer.parseInt(br1.readLine());
                // Ambil data umur dari keyboard
                System.out.print("Nilai B = ");
                int nilai2 = Integer.parseInt(br1.readLine());
                int jumlah = nilai1 + nilai2;

                // Print
                System.out.println("Jumlah = " +jumlah);
                } catch (IOException ex) {
                System.out.println("Error pada saat input data");
               }
       }
}
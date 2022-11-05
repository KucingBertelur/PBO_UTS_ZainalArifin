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
public class Bab1_2Biodata_BufferedReader {
    public static void main(String[] args) {
        //Buat Buffer Reader
        BufferedReader br1 = new BufferedReader (new
        InputStreamReader(System.in));
        
            try {
                System.out.print("Masukkan Nama = ");
                String nama = br1.readLine();
 
                System.out.print("Masukkan NIM = ");
                int NIM = Integer.parseInt(br1.readLine());
                
                System.out.print("Masukkan Alamat = ");
                String alamat = br1.readLine();
                
                // Print
                System.out.println("Assalammu'alaikum " + nama + 
                ". dengan NIM " + NIM + ", Alamat di " + alamat);
                
                } catch (IOException ex) {
                System.out.println("Error pada saat input data");
               }
       }
}
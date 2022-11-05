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
public class Bab3_Soal1_1Operator_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Masukkan nilai1 = ");
        int n1 = s1.nextInt();
        System.out.println("Masukkan nilai2 = ");
        int n2 = s1.nextInt();
        
        //Hitung
        int h1 =(n1 + n2) * (n2 + n1);
        int h2 =(n1 % 4) * n2;
        
        //print
        System.out.println("a. Hasil dari penjumlahan n1 dan n2, lalu dikalikan dengan penjumlahan n2 dan n1 adalah :");
        System.out.println("h1 = " + h1);
        System.out.println("b. Sisa bagi dari n1 dengan 4, kemudian dikalikan dengan n2 adalah :");
        System.out.println("h2 = " + h2);
    }
}   
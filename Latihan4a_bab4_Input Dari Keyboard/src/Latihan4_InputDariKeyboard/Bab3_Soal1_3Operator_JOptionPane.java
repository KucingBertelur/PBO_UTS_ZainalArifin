package Latihan4_InputDariKeyboard;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class Bab3_Soal1_3Operator_JOptionPane {
    public static void main(String[] args) {
        // Input Nama
    int n1 =
Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai pertama anda!"));
    int n2 =
Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai kedua anda!"));
        // Print
        int h1 =(n1 + n2) * (n2 + n1);
        int h2 =(n1 / 4) * n2;
        //print
        System.out.println("a. Hasil dari penjumlahan n1 dan n2, lalu dikalikan dengan penjumlahan n2 dan n1 adalah :");
        System.out.println("h1 = " + h1);
        System.out.println("b. Sisa bagi dari n1 dengan 4, kemudian dikalikan dengan n2 adalah :");
        System.out.println("h2 = " + h2);
    }
}   
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
public class Bab2_3Penjumlahan_JOptionPane {
    public static void main(String[] args) {
        // Input Nama
        
    int nilai1 =
    Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai pertama"));
    int nilai2 =
    Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai kedua"));
    int jumlah = nilai1 + nilai2;
        System.out.println
        ("Hasil dari " + nilai1 + " ditambah " + nilai2 + " adalah " +jumlah);
    } 
}
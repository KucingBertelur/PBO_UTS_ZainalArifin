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
public class Bab1_3Biodata_InputBR {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
        int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM anda!"));
        String alamat = JOptionPane.showInputDialog("Masukkan alamat anda!");

        System.out.println
        ("Hai " + nama + ", dengan nim " + nim + ", alamat di " + alamat);
    } 
}
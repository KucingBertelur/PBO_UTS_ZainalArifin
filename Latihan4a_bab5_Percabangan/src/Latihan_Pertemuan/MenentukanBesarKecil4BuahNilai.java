package Latihan_Pertemuan;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class MenentukanBesarKecil4BuahNilai {

    /**
     * @param args the command line arguments
     */
    
    
    //Buatlah program java untuk menentukan nilai 
    //terbesar dari 2 nilai dengan menggunakan input
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai 1 = ");
    int nilai1 = inp.nextInt();
    
    System.out.print("Masukkan Nilai 2 = ");
    int nilai2 = inp.nextInt();
    
    System.out.print("Masukkan Nilai 3 = ");
    int nilai3 = inp.nextInt();
    
    System.out.print("Masukkan Nilai 4 = ");
    int nilai1dan2 = inp.nextInt();
        
    if(nilai1 < nilai2) {
        System.out.println( +nilai1+ " Lebih kecil daripada " +nilai2);
    } else if(nilai1dan2 > nilai3) {
        System.out.println( +nilai1+ " Lebih besar daripada " +nilai2);
    }
}
}
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
public class Hari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int noHari = 7;
        
        switch (noHari) {
            case 1 -> System.out.println("Hari ke-" +noHari+ " adalah Minggu");
            case 2 -> System.out.println("Hari ke-" +noHari+ " adalah Senin");
            case 3 -> System.out.println("Hari ke-" +noHari+ " adalah Selasa");
            case 4 -> System.out.println("Hari ke-" +noHari+ " adalah Rabu");
            case 5 -> System.out.println("Hari ke-" +noHari+ " adalah Kamis");
            case 6 -> System.out.println("Hari ke-" +noHari+ " adalah Jum\'at");
            case 7 -> System.out.println("Hari ke-" +noHari+ " adalah Sabtu");
            default -> System.out.println("Tidak ada hari ke-" +noHari);
        }
    }
}
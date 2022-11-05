package Latihan;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Apakah anda mahasiswa Poliban ? (Y jika setuju)");
        String jawaban = scan.next();
        if ("Y".equals(jawaban)){
            System.out.println("Selamat Berjuang di Poliban");
        }else{
            System.out.println("Selamat Datang Di Poliban");
        }
    }
}
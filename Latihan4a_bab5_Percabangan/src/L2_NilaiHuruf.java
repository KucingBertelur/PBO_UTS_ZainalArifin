
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class L2_NilaiHuruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Buat Scanner
    Scanner inp = new Scanner(System.in);
    
    // Ambil Nama
    System.out.print("Masukkan nama anda = ");
    inp.next();
    
    // Ambil NIM
    System.out.print("Masukkan NIM = ");
    inp.nextInt();
    
    // Ambil Nilai
    System.out.print("Masukkan Nilai = ");
    int nilai = inp.nextInt();
    
    if(nilai <= 0) {
        System.out.println("Error");
    } else if(nilai <= 55) {
        System.out.println("E");
    } else if(nilai <= 65) {
        System.out.println("D");
    } else if(nilai <= 75) {
        System.out.println("C");
    } else if(nilai <= 85) {
        System.out.println("B");
    } else if(nilai <= 100) {
        System.out.println("A");
    } if(nilai > 100 ) {
        System.out.println("Error");
    }
  }
}
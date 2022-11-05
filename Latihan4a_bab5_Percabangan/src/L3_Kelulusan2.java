
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class L3_Kelulusan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    // Ambil Nama
    System.out.print("Masukkan nama anda\t = ");
    String nama = inp.next();
    
    // Ambil NIM
    System.out.print("Masukkan jenis kelamin\t = ");
    String kelamin = inp.next();
    
    // Ambil Nilai
    System.out.print("Masukkan Tinggi badan\t = ");
    int tinggi = inp.nextInt();

    if("laki-laki".equals(kelamin)) {
        if(tinggi < 170) {
            System.out.println("Anda Gagal");
        } else {
            System.out.println("Selamat Anda Lulus");
        }
}else if("perempuan".equals(kelamin)) {
        if (tinggi < 160) {
            System.out.println("Anda Gagal");
        } else {
            System.out.println("Selamat Anda Lulus");
        }
     }
   }
 }
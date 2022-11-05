/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author sutri
 */
public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Siapakah presiden Pertama Indonesia ?");
        System.out.println("a.Dr.Ir.H.Soekarno");
        System.out.println("a.B.J. Habibie");
        System.out.println("c.Megawati Seokarno Putri");
        System.out.println("d.Abdurrahman Wahid");
        char pilih =scan.next().charAt(0);
        
        switch(pilih){
            case 'a':
                System.out.println("Benar !");
            break;
            case 'b':
                System.out.println("Salah,jawabannya adalah Dr.Ir.H.Soekarno");
                break;
            case 'c' :
                System.out.println("Salah,jawabannya adalah Dr.Ir.H.Soekarno");
                break;
            case 'd' :
                System.out.println("Salah,jawabannya adalah Dr.Ir.H.Soekarno");
                break;
            default :
                System.out.println("Sistem Error");
        }
    }
}



import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class L4_BobotNilaiHuruf {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner kode = new Scanner (System.in);
        System.out.print("Masukan Huruf : ");
        String grade = kode.nextLine();
        switch(grade){
            case "A" -> System.out.println("4");
            case "B" -> System.out.println("3");
            case "C" -> System.out.println("2");
            case "D" -> System.out.println("1");
            case "E" -> System.out.println("0");
            default -> System.out.println("Grade tidak ditemukan");
        }
    }
}

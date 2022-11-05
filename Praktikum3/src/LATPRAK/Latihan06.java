/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LATPRAK;

import java.util.Scanner;

/**
 *
 * @author sutri
 */
public class Latihan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.println("Urutan Zodiac ke- = ");
        int Zodiak = input.nextInt();
        System.out.println("");
        
        switch (Zodiak){
            case 0 -> System.out.println("Urutan Zodiak ke-" + Zodiak + " adalah Aries");
            case 1 -> System.out.println("Urutan Zodiak ke-" + Zodiak + " adalah Capricorn");
            case 3 -> System.out.println("Urutan Zodiak ke-" + Zodiak + " adalah Aquarius");
            case 4 -> System.out.println("Urutan Zodiak ke-" + Zodiak + " adalah Pisces");
            case 5 -> System.out.println("Urutan Zodiak ke-" + Zodiak + " adalah Taurus");
            case 6 -> System.out.println("Urutan Zodiak ke-" + Zodiak+ " adalah Gemini");
            case 7 -> System.out.println("Urutan Zodiak Ke-" + Zodiak+ " adalah Cancer");
            case 8 -> System.out.println("Urutan Zodiak Ke-" + Zodiak+ " adalah Leo");
            case 9 -> System.out.println("Urutan Zodiak Ke-" + Zodiak+ " adalah Virgo");
            case 10 -> System.out.println("Urutan Zodiak Ke-" + Zodiak+ " adalah Libra");
            case 11 -> System.out.println("Urutan Zodiak Ke-" + Zodiak+ " adalah Scorpio");
            case 12 -> System.out.println("Urutan Zodiak Ke-" + Zodiak+ " adalah Sagittarius");
            default -> System.out.println("Tidak ada Zodiak ke-" + Zodiak);
        }
    }
}
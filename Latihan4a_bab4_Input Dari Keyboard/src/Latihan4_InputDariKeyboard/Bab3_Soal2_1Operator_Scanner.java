/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan4_InputDariKeyboard;

import java.util.Scanner;

/**
 *
 * @author sutri
 */
public class Bab3_Soal2_1Operator_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Masukkkan nilai 1 = ");
        int n1 = s1.nextInt();
        
        System.out.println("Masukkkan nilai 2 = ");
        int n2 = s1.nextInt();
        
        int h1 = (n1 + n2) * (n2 + n1);
        int h2 = (n1 % 4) * n2;
        
        boolean b1 = h1 >= h2;
        boolean b2 = h2 >= h1;
        boolean b3 = (h1 % 4) == (++h2 % 5);
        boolean b4 = (b1 ^ b3) && (b2 || b3);
        boolean b5 = b2 || (b3 &&(b2 ^ b1));
        //print
        System.out.println("a. h1 besar sama dengan h2");
        System.out.println("b1 = " + b1);
        
        System.out.println("b. h2 besar sama dengan h2)");
        System.out.println("b2 = " + b2);
        
        System.out.println("c. h1 Mod 4)==(++h2 Mod 5");
        System.out.println("b3 = " + b3);
        
        System.out.println("d. (b1 XOR b3)AND(b2 OR b3)");
        System.out.println("b4 = " + b4);
        
        System.out.println("e. b2 OR (b3 AND(b2 XOR b1)");
        System.out.println("b5 = " + b5);                
    }  
}    
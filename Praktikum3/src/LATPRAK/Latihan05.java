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
public class Latihan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan nilai huruf untuk rata rata : ");
        int a = scan.nextInt();
        if (a>=100){
   System.out.println("Nilai Anda E");
  }
  else if (a>=0&&a<=45){
   System.out.println("Nilai Anda E");
  }
  else if (a>=45&&a<=54){
   System.out.println("Nilai Anda D");
  }
  else if (a>=55&&a<=64){
   System.out.println("Nilai Anda C");
  }
  else if (a>=65&&a<=79){
   System.out.println("Nilai Anda B");
  }
  else if (a>=80&&a<=100){
   System.out.println("Nilai Anda A");
  }
  }
}
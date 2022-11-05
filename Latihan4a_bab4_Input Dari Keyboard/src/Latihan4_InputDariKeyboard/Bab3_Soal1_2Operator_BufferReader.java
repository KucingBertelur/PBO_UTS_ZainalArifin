import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sutri
 */
public class Bab3_Soal1_2Operator_BufferReader {
    public static void main(String[] args) {
        //Buat Buffer Reader
        BufferedReader br1 = new BufferedReader (new
        InputStreamReader(System.in));
        
            try {
                
                System.out.print("Masukkan nilai 1 = ");
                int n1 = Integer.parseInt(br1.readLine());
                
                System.out.print("Masukkan nilai 2 = ");
                int n2 = Integer.parseInt(br1.readLine());
                
                int h1 =(n1 + n2) * (n2 + n1);
                int h2 =(n1 % 4) * n2;           
                
                System.out.println("a. Hasil dari penjumlahan n1 dan n2, lalu dikalikan dengan penjumlahan n2 dan n1 adalah :");
                System.out.println("h1 = " + h1);
                System.out.println("b. Sisa bagi dari n1 dengan 4, kemudian dikalikan dengan n2 adalah :");
                System.out.println("h2 = " + h2);

                } catch (IOException ex) {
                System.out.println("Error pada saat input data");
               }
       }
}
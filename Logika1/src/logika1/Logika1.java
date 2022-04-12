/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika1;

import java.util.Scanner;

/**
 *
 * @author maylany hellena
 */
public class Logika1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] angka = new int [100];
         int max=0, min=0;
         Scanner input = new Scanner(System.in);
         //input data
         for (int a=1; a<=5; a++){
             System.out.print("Bilangan ke-" +a+"=");
             angka[a] = input.nextInt();
         }
         //proses
         for (int a=1; a<=5; a++){
             if (a == 1){
                 max = angka[1];
                
             }
             if(angka[a] > max) max = angka[a];
             
         }
         //output
         System.out.println("Bilangan Terbesar = " + max);
         
    }
    
}
    

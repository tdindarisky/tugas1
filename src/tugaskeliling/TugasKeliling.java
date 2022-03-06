/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskeliling;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class TugasKeliling {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]){
         double K, d, phi = 3.14;
         Scanner scan = new Scanner (System.in);
         
         System.out.print("Masukkan diameter lingkaran: ");
         d=scan.nextDouble();
         
         K = phi * d;
         System.out.println("Keliling Lingkaran adalah " + String.format("%.2f", K));
         
     }
    
}

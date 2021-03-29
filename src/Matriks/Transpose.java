/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

import java.util.Scanner;

/**
 *
 * @author ramanda
 */
public class Transpose {
    public static void main(String[] args) {
//         int matriks7[][] = {
//                            {2,1,-5},
//                            {3,4,2}
//                            };
         Scanner scan = new Scanner(System.in);
         int matriks7[][] = new int[2][3];
         int m;
         int trans[][] = new int[3][2];
         
         System.out.print("Masukan Isi Matriks : ");
         for(int baris = 0 ; baris < matriks7.length; baris++){
             for(int kolom = 0 ; kolom < matriks7[0].length; kolom++){
                 matriks7[baris][kolom] = scan.nextInt();
             }
             System.out.println("");
         }
         
         for(int i = 0 ; i < matriks7.length; i++){
             for(int j = 0 ; j < matriks7[0].length; j++){
                 System.out.print(matriks7[i][j] + "\t");
             }
             System.out.println("");
         }
            System.out.println("Hasil Transpose");
            for(int i = 0; i < matriks7.length; i++){
                for(int j = 0; j < matriks7[0].length ; j++){
                trans[j][i] = matriks7[i][j];
    }
}
            for(int i = 0; i < matriks7[0].length; i++){
                for(int j = 0; j< matriks7.length; j++){
                System.out.print(trans[i][j] + "\t");
      }
                System.out.println();
        }
            System.out.println("Ramanda Kholisandra");
    }
}

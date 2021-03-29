/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author ramanda
 */
public class PerkalianMatriks {
    public static void main(String[] args) {
        int matriks4[][] = {
                              {11,2,8},
                              {12,4,5}
                            };    
        
        int matriks5[][] = {
                             {3,5},
                             {4,2},
                             {7,9}      
                            };
   
   int matriks6 [][] = new int[matriks4.length][matriks5[0].length];
         for(int x = 0; x < matriks4.length; x++){
             for(int y = 0 ; y < matriks5[0].length; y++){
                 for(int z = 0 ; z < matriks4[0].length; z++){
                     matriks6[x][y] += matriks4[x][z] * matriks5[z][y];
                  }
              }
          }
         
         for(int[] c: matriks6){
            for(int q: c){
                System.out.print(q+"\t");
            }
            System.out.println();
       }
         System.out.println("Ramanda Kholisandra");
    }
}

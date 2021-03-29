/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author rama
 */
public class PenguranganMatriks {
    public static void main(String[] args) {
        int matriks1 [][] = {
                       {10,20},
                       {22,23},
                       {14,17}
                       };
        int matriks2 [][] = {
                       {2,3},
                       {5,6},
                       {4,7}
                       };
        
        if(matriks1.length == matriks2.length && matriks1[0].length == matriks2[0].length){
        int matriks3 [][] = new int[matriks1.length][matriks1[0].length];    
        
        for(int i = 0 ; i < matriks1.length; i++){
            for(int j = 0 ; j < matriks1[0].length; j++){
                matriks3[i][j] = matriks1[i][j] - matriks2[i][j]; 
                }
            }
        for(int[] c: matriks3){
            for(int q: c){
                System.out.print(q+"\t");
            }
            System.out.println();
        }
      }else{
            System.out.println("Matriks Error");
        }
    }
     
}

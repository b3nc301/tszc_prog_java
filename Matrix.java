/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //int[] vector1 = new int[4]; //vektor deklarálása és inicializálása
            
            int[][] matrix1 = new int[5][4]; //[sor][oszlop]
            
            //elso cikulus a sorokon megy vegig{
                //masodik ciklus az oszlopokon megy vegig
            //}
            Scanner scanner = new Scanner(System.in);
            System.out.println(matrix1.length);
            System.out.println(matrix1[0].length);
            
            for(int i=0;i<matrix1.length;i++){
                for(int j=0;j<matrix1[i].length;j++){
                    System.out.println("Adja meg a " + i + ". sor " + j + ". oszlop elemét:");
                    matrix1[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            
            
            for(int i=0;i<matrix1.length;i++){
                for(int j=0;j<matrix1[i].length;j++){
                    System.out.println(i + ". sor " + j + ". oszlop eleme:" + matrix1[i][j]);
                }
            }
            
            
            
            for(int i=0;i<5;i++){
                for(int j=0;j<4;j++){
                    System.out.print( matrix1[i][j] +" ");
                }
                System.out.println("");
            }
            
            

    }
    
}

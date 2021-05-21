/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkiir;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Fajlkiir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        String[][] matrix = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println("Adja meg a tömb [" +(i+1) +"][" +(j+1)+ "]. elemét:" );
                matrix[i][j]=scanner.nextLine();
            }
        }
        
        try{
            File f1 = new File("fajl1.txt");
            PrintStream kiir = new PrintStream(f1);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    kiir.print(matrix[i][j]);
                    kiir.print("\t");
                }
               kiir.println("");
            }
            kiir.close();
        }
        
        catch(Exception e){
            System.err.println("HIBA!");
        }
     
    }
    
}

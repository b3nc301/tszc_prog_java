/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkiir2;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Fajlkiir2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] vektor = {"Egy","Ketto","Harom"};
        String[][] matrix= {{"Egy","Ketto"},
                            {"Harom","Negy"}};
        File f1 = new File("fajlnev.txt");
        try{
            //Scanner scanner = new Scanner(f1);
            PrintStream ps = new PrintStream(f1);
            /*for(int i=0;i<vektor.length;i++){
            ps.println(vektor[i]);
            }*/
            
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    ps.print(matrix[i][j]+";");
                }
                ps.println();
            }

        }
        catch(Exception e){
            System.err.println("HIBA!");
        }
    }
    
    
}

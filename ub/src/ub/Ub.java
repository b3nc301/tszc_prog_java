/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Ub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //1. feladat: fájl beolvasás és tömb feltöltés
            //2. feladat: hány férfi vett részt
            //3. feladat: hány férfi teljesített legalább 50%-ot
            //4. feladat: hány nő nevében szerepel a Judit név
            String[][] matrix = new String[186][5];
            File file1 = new File("ub2017egyeni.txt");
            try{
                Scanner scanner = new Scanner(file1);
                int i=0;
                scanner.nextLine();
                while(scanner.hasNextLine()){
                    matrix[i]=scanner.nextLine().split(";");
                    System.out.println(matrix[i][0]);
                    i++;
                } 
                scanner.close();
            }
            
            catch(Exception E){
                System.err.println("HIBA!");
            }
            //2. feladat
            int osszeg=0;
            for(int i=0;i<matrix.length;i++){
            if(matrix[i][2].equals("Ferfi")){
            osszeg++;
            }
            }
            System.out.println("A versenyen " + osszeg+ " férfi vett részt.");
            //3. feladat
            int osszeg1 = 0;
            for(int i=0;i<matrix.length;i++){
            if(matrix[i][2].equals("Ferfi") && Integer.parseInt(matrix[i][4]) >= 50){
            osszeg1++;
            }
            }
            System.out.println("A versenyen " + osszeg1+ " férfi vett részt, aki teljesített legalább 50%-ot.");
            //4. feladat
            int osszeg2=0;
            for(int i=0;i<matrix.length;i++){
            if(matrix[i][2].equals("Noi") && matrix[i][0].contains("Judit")){
            osszeg2++;
            }
            }
            System.out.println("A versenyen " + osszeg2+ " Judit nevű nő vett részt.");
    }
    
}

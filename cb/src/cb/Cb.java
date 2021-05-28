/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Cb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. feladat: A fájl beolvasása tömbbe
        //2. feladat: Hány ember volt, aki 4, vagy több adást indított ugyanazon percben
        //3. feladat: 7:00-7:59 között hány adás volt összesen
        //4. feladat:Józsi indított-e adást 8:50-8:55 között
        //5. feladat Béla hány adást indított?
        //1. feladat
        String[][] matrix = new String[381][4];
        File f1 = new File("cb.txt");
        try{
        Scanner sc = new Scanner(f1);
        sc.nextLine();
        int i=0;
        while(sc.hasNextLine()){
            matrix[i]=sc.nextLine().split(";");
            i++;
        }
        sc.close();
        }
        catch(Exception e){
            System.err.println("HIBA!");
        }
        //2. feladat
        int osszeg=0;
        for(int i=0;i<matrix.length;i++){
            if(Integer.parseInt(matrix[i][2])>=4){
                osszeg++;
            }
        }
        
        System.out.println(osszeg+" ember volt aki ugyanazon percben 4 vagy több adást indított");
        
        //3. feladat
        int osszeg1=0;
        
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0].equals("7")){
                osszeg1+=Integer.parseInt(matrix[i][2]);
            }
        }
        System.out.println("7:00 és 7:59 között " + osszeg1 + " adás volt.");
        
        boolean talalt=false;
        int i=0;
        while(!talalt && i<matrix.length){
        if(matrix[i][3].equals("Józsi") &&
                matrix[i][0].equals("8") &&
                Integer.parseInt(matrix[i][1])>=50 &&
                Integer.parseInt(matrix[i][1])<=55)
        {    
            talalt=true;
        }
        i++;
        }
        if(talalt){
            System.out.println("Józsi indított adást 8:50-8:55 között");
        }
        else{
           System.out.println("Józsi nem indított adást 8:50-8:55 között");

        }
        //5. feladat
        int osszeg3=0;
        for(i=0;i<matrix.length;i++){
            if(matrix[i][3].equals("Laci")){
                osszeg3+=Integer.parseInt(matrix[i][2]);
            }
        }
        System.out.println("Laci " +osszeg3+ " adást indított összesen.");
    }
    
}

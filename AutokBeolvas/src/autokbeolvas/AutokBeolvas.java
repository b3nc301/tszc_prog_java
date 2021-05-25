/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autokbeolvas;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class AutokBeolvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  be kell olvasni az autókat egy mátrixba(31 sor)
        // 1.: van-e kék autó?
        // 2.: Hány 2005 előtti autó van?
        // 3.: Mi a Suzuki SX4-ek átlagéletkora?
        
        String[][] matrix = new String[31][4];
        File f1 = new File("autok.txt");
        
        try{
        Scanner sc = new Scanner(f1);
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
        //elso feladat
        int i=0;
        while(!matrix[i][3].equals("Kek") && i<(matrix.length-1)){
        i++;
        }
        if(i<(matrix.length-1)){
            System.out.println("Van kék autó!");
        }
        else{
            System.out.println("Nincs kék autó!");
        }
        //masodik feladat
        int osszeg=0;
        for(i=0;i<matrix.length;i++){
            if(Integer.parseInt(matrix[i][1])<2005){
            osszeg++;
            }
        }
        System.out.println("2005 előtti autóból " + osszeg+ " darab van");
        int gyartas=0;
        int szamol=0;
        for(i=0;i<matrix.length;i++){
        if(matrix[i][0].equals("Suzuki SX4")){
        gyartas+=Integer.parseInt(matrix[i][1]);
        szamol++;
        }
        }
        float atlag=(float)gyartas/szamol;
        System.out.println("A Suzuki SX4-ek átlagos életkora: " + (2021-atlag));
        
        
    }
    
}

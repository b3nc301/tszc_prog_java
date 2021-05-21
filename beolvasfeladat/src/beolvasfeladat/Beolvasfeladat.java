/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasfeladat;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Beolvasfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  be kell olvasni az autókat egy mátrixba
        // 1.: van-e kék autó?
        // 2.: Hány 2005 előtti autó van?
        // 3.: Mi a Suzuki SX4-ek átlagéletkora?
        
        String[][] matrix = new String[31][4];
        File f1 = new File("autok.txt");
        try{
            Scanner scanner = new Scanner(f1);
            int i=0;
            while(scanner.hasNextLine()){
                matrix[i]=scanner.nextLine().split(";");
                i++;
            }
            scanner.close();
            
        }
        catch(Exception e){
            System.out.println(e);        }
        
        
        //1. feladat: 4. oszlopban van a szín(tehát a 3. indexen)
        //végigmegyünk a sorokon, 4. oszlopot nézzük, ha az kék, akkor van
        int i=0;
        while(!matrix[i][3].equals("Kek") && i<(matrix.length-1)){
        i++;
        }
        if(i<(matrix.length-1)){
            System.out.println("Van kék autó.");
        }
        else{
            System.out.println("Nincs kék autó");
        }
        
        int osszeg=0;
        for(i=0;i<matrix.length;i++){
            if(Integer.parseInt(matrix[i][1])<2005){
            osszeg++;
            }
        }
        System.out.println(osszeg +" darab 2005 előtti autó van.");
        
        //3. feladat
        int evszamosszeg=0;
        int darab=0;
        for(i=0;i<matrix.length;i++){
        if(matrix[i][0].equals("Suzuki SX4")){
        evszamosszeg+=Integer.parseInt(matrix[i][1]);
        darab++;
        }
        }
        
        System.out.println("A Suzuki SX-4-ek átlag életkora: " +(2021-((float)evszamosszeg/darab)) );
             
    }
    
}

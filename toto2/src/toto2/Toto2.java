/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toto2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Toto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //olvassunk be a fájlból
        //1. feladat: Hány telitalálatos volt 2020-ban?
        //2. feladat: 2020-ban mekkora nyereményt osztottak ki összesen?
        //3. feladat: 2019-ben hány sorsolás volt összesen?
        //4. feladat: Volt-e 2020-ban páros héten telitalálatos?
        
        String[][] matrix = new String[1630][6];
        File file1 = new File("toto.txt");
        try{
            Scanner scanner = new Scanner(file1);
            int i=0;
            scanner.nextLine();
            while(scanner.hasNextLine()){
                matrix[i]=scanner.nextLine().split(";");
                i++;
            }
        }
        catch(Exception e){
            System.err.println("HIBA!");
        }
        //1. feladat: Hány telitalálatos volt 2020-ban?
        int osszeg=0;
        for(int i=0;i<matrix.length;i++){
        if(matrix[i][0].equals("2020")){
            osszeg = osszeg+Integer.parseInt(matrix[i][3]); //osszeg+=Integer.parseInt(matrix[i][3])
        }
        }
        System.out.println(osszeg+ " telitalálatos volt 2020-ban");
        
        //2. feladat: 2020-ban mekkora nyereményt osztottak ki összesen?
        int osszeg1=0;
        for(int i=0;i<matrix.length;i++){
        if(matrix[i][0].equals("2020")){
            osszeg1 += Integer.parseInt(matrix[i][3]) * (Integer.parseInt(matrix[i][4]));
        }
        }
        System.out.println(osszeg1+ " Ft nyereményt osztottak ki összesen 2020-ban");
                
        //3. feladat: 2019-ben hány sorsolás volt összesen?
        int sorsolasSzam=0;
        for(int i=0;i<matrix.length;i++){
        if(matrix[i][0].equals("2019")){
            sorsolasSzam++;
        }
        }
        System.out.println(sorsolasSzam+ " sorsolás volt 2019-ben");
        
        //4. feladat: Volt-e 2020-ban páros héten telitalálatos?
        boolean telitalalat = false;
        int i=0;
        while(!telitalalat && i<matrix.length){
            if(matrix[i][0].equals("2020") &&
               Integer.parseInt(matrix[i][1])%2==0 &&
               Integer.parseInt(matrix[i][3])>0
                    ){
            telitalalat=true;
            }
            else{
            i++;
            }
                

        }
        if(telitalalat){
            System.out.println("Volt telitalálat.");
        }
        else{
                    System.out.println("Nem volt telitalálat.");

        }
        

        

        
        
        
        
        
    }
    
}

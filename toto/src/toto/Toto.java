/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toto;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Toto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] m1 = new String[1630][6];
        File f1 = new File("toto.txt");
        try{
            Scanner scanner = new Scanner(f1);
            int i=0;
            scanner.nextLine();
            while(scanner.hasNextLine()){
                m1[i]=scanner.nextLine().split(";");
                i++;
            }
            scanner.close();
        }
        catch(Exception e){
            System.err.println("HIBA!");
        }
        //1. feladat: Hány telitalálatos volt 2020-ban
        int osszeg=0;
        for(int i=0;i<m1.length;i++){
        
       if(m1[i][0].equals("2020")){
            osszeg+=Integer.parseInt(m1[i][3]);
       }
        
        }
        System.out.println("2020-ban " + osszeg + " telitalálatos volt.");
        
       //2. feladat: 2020-ban mekkora nyereményt osztottak ki összesen?
        int nyeremeny=0;
        for(int i=0;i<m1.length;i++){
        
       if(m1[i][0].equals("2020")){
            nyeremeny+=Integer.parseInt(m1[i][4])*Integer.parseInt(m1[i][3]);
       }
        
        }
        System.out.println("2020-ban " + nyeremeny + "Ft nyereményt osztottak ki.");
        
        //3. feladat: 2019-ben hány sorsolás volt összesen?
       int osszeg1=0;
        for(int i=0;i<m1.length;i++){
        
       if(m1[i][0].equals("2019")){
       
            osszeg1++;
       }
       }
        System.out.println("2019-ben " + osszeg1+ " sorsolás volt összesen.");
        //4. feladat: Volt-e 2020-ban páros héten telitalálatos?
        boolean talalt= false;
        int i=0;
        while(!talalt && i<m1.length){
            if(        m1[i][0].equals("2020")
                    &&(Integer.parseInt(m1[i][1])%2==0)
                    && Integer.parseInt(m1[i][3])!=0){
                talalt=true;
            }
            else{
            i++;
            }
        }
        if(talalt){
            System.out.println("Volt 2020-ban páros héten telitalálatos");
        }
        else {
                    System.out.println("Nem volt 2020-ban páros héten telitalálatos");

        }
        
    }
    
}

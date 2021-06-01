/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzemanyag;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Uzemanyag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fájl beolvasása
        //1. feladat: mekkora volt a legkisebb külömbség a benzin és a gázolaj
        //            árfolyama között?
        //2. feladat: Mekkora volt a legmagasabb üzemanyag ár a benzin esetében?
        //3. feladat: Volt-e 2014-ben 400 forint alatt a gázolaj?
        //4. feladat: Mekkora volt az átlagos üzemanyag ár 2013-ban?
         String[][] matrix = new String[325][3];
        File file1 = new File("uzemanyag.txt");
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
        //1. feladat: mekkora volt a legkisebb külömbség a benzin és
        //            a gázolaj árfolyama között?
        int kulombseg = 150;
        for(int i=0;i<matrix.length;i++){
            if(Math.abs(Integer.parseInt(matrix[i][1])-Integer.parseInt(matrix[i][2]))
                    < kulombseg){
            kulombseg = 
                    Math.abs(Integer.parseInt(matrix[i][1])-Integer.parseInt(matrix[i][2]));
            }
        }
        System.out.println("A benzin és a gázolaj között a legkisebb külömbség " +kulombseg +" Ft volt.");
        //2. feladat: Mekkora volt a legmagasabb üzemanyag ár a benzin esetében?
        int max=0;
        for(int i=0;i<matrix.length;i++){
        if(Integer.parseInt(matrix[i][1])>max){
        max=Integer.parseInt(matrix[i][1]);
        }
        }
        
        System.out.println("A legmagasabb benzinár " + max + " Ft volt.");
        //3. feladat: Volt-e 2014-ben 400 forint alatt a gázolaj?
        boolean volt_e= false;
        
        int i=0;
        while(!volt_e && i<matrix.length){
        if(matrix[i][0].contains("2014.") && Integer.parseInt(matrix[i][2])<400){
            volt_e=true;
        }
        else{
                i++;
            }
        }
        if(volt_e){
            System.out.println("Volt 400 forint alatt.");
        }
        else{
                    System.out.println("Nem volt  400 forint alatt.");

        }
        //4. feladat: Mekkora volt az átlagos üzemanyag ár 2013-ban?
        int osszeg=0;
        int darab=0;
        for(i=0;i<matrix.length;i++){
        if(matrix[i][0].contains("2013.")){
            osszeg+=Integer.parseInt(matrix[i][1]) + Integer.parseInt(matrix[i][2]);
            darab+=2;
        }
        }
        
        System.out.println("2013-ban az átlag üzemanyagár " + (float) osszeg/darab +" Ft volt.");

    }
    
}

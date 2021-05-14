/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* try{
int[] tomb = new int[5];
tomb[2]=0;
        }
        catch(Exception e){
            System.out.println("Túlindexelés");
        }
        
        System.out.println("Folytatódik a program...");*/
       
       File file1 = new File("fajlnev.txt");
       try{
           Scanner sc = new Scanner(file1);
        /*for(int i=0;i<3;i++){
           System.out.println(sc.nextLine());
       }*/
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
       }
       catch(FileNotFoundException e){
           System.out.println("A fájl nem található!");
       }


    }
    
}

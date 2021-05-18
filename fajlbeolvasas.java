/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*int[] tomb = new int[5];
try{
tomb[4]=10;
}
catch(Exception e){
    System.out.println("Hiba történt!");
}
System.out.println("Folytatódik...");*/

File file1 = new File("fajl.txt");

try{
    Scanner sc = new Scanner(file1);
    /*for(int i=0;i<4;i++){
    System.out.println(sc.nextLine());
    }*/
    while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
    }
    sc.close();
}
catch(Exception e){
    System.err.println("HIBA TÖRTÉNT!");
}
    }
    
}

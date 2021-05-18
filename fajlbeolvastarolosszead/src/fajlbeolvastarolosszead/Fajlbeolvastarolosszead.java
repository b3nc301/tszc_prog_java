/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvastarolosszead;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Fajlbeolvastarolosszead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tomb = new int[7];
        File fajl = new File("1/file.txt");
        try{
            Scanner scanner = new Scanner(fajl);
            int i=0;
            while(scanner.hasNextLine()){
                tomb[i]=Integer.parseInt(scanner.nextLine());
                i++;
            }
        }
        catch(Exception e){
            System.err.println("HIBA!");
        }
        int osszeg =0;
       for(int i=0;i<tomb.length;i++){
                System.out.println(tomb[i]);
                osszeg+=tomb[i];
            }
        System.out.println("Összeg:" + osszeg);
        System.out.println("átlag:" +  ((float)osszeg/tomb.length));
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pozitiv.e;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class PozitivE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int egySzam;
        Scanner beolvas = new Scanner(System.in);
        System.out.println("Adjon meg egy számot");
        egySzam = beolvas.nextInt();
        if(egySzam>0){
            System.out.println("A megadott szám pozitív.");
        }
        else{
            if(egySzam<0){
                System.out.println("A megadott szám negatív.");
            }
            else{
                System.out.println("A szám nulla.");
            }
        }
    }
    
}

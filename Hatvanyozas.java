/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatvanyozas;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Hatvanyozas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elsoSzam; //alap
        int masodikSzam; //kitevo
        int eredmeny=1;
        Scanner beolvas = new Scanner(System.in);
        
        System.out.println("Adja meg az alapot:");
        elsoSzam = Integer.parseInt(beolvas.nextLine());
        System.out.println("Adja meg a kitevőt:");
        masodikSzam = Integer.parseInt(beolvas.nextLine());
        for(int i=0;i<masodikSzam;i++){
            eredmeny = eredmeny * elsoSzam;
        }
        System.out.println("Az eredmény:" + eredmeny);
        }
    
}

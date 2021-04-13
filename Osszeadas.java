/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszeadas;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Osszeadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elsoSzam;
        int masodikSzam;
        Scanner beolvas = new Scanner(System.in);
        
        System.out.println("Adja meg az első számot:");
        elsoSzam = Integer.parseInt(beolvas.nextLine());
        System.out.println("Adja meg a második számot:");
        masodikSzam = beolvas.nextInt();
        int osszeg = elsoSzam + masodikSzam;
        System.out.println("A két számnak az összege: " + osszeg);

        
    }
    
}

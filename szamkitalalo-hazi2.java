/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamkitalalo;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Szamkitalalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kitalalandoSzam = 25;
        boolean kitalalva = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Számkitaláló 1.0");
        System.out.println("Írjon be egy tippet.");
        while(!kitalalva){
            if(Integer.parseInt(sc.nextLine()) == kitalalandoSzam){
                System.out.println("Sikerült!");
                kitalalva = true;
            }
            else{
                System.out.println("Nem sikerült! Próbáld újra!");
            }
        }
    }
    
}

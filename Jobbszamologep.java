/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobbszamologep;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Jobbszamologep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float elsoSzam;
        float masodikSzam;
        char muveletiJel;
        Scanner beolvas = new Scanner(System.in);
        
        System.out.println("Adja meg az első számot:");
        elsoSzam = Float.parseFloat(beolvas.nextLine());
        System.out.println("Adja meg a második számot:");
        masodikSzam = Float.parseFloat(beolvas.nextLine());
        
        
        
        // while(ervenyese) -> akkor lép be, ha az ervenyese változó igaz
        // while(!ervenyese) -> akkor lép be, ha az ervenyese változó hamis
        
        /*
        boolean ervenyese = false;
        while(!ervenyese){
        System.out.println("Adja meg a műveletet:");
        muveletiJel = beolvas.next().charAt(0);
        if(muveletiJel == '+'){
            float osszeg = elsoSzam + masodikSzam;
            System.out.println("A két számnak az összege: " + osszeg);
            ervenyese=true;
            
        }
        else{
        if(muveletiJel == '-'){
            float kulombseg = elsoSzam - masodikSzam;
            System.out.println("A két számnak az külömbsége: " + kulombseg);    
            ervenyese=true;

        }
        else{}
        }
        
        }*/
        boolean ervenyese;
        do{
            
        System.out.println("Adja meg a műveletet:");
        muveletiJel = beolvas.next().charAt(0);
        if(muveletiJel == '+'){
            float osszeg = elsoSzam + masodikSzam;
            System.out.println("A két számnak az összege: " + osszeg);
            ervenyese=true;
            
        }
        else{
        if(muveletiJel == '-'){
            float kulombseg = elsoSzam - masodikSzam;
            System.out.println("A két számnak az külömbsége: " + kulombseg);    
            ervenyese=true;

        }
        else{
            ervenyese = false;
        }
        }
        } while(!ervenyese);
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamologep;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Szamologep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float elsoSzam;
        float masodikSzam;
        char muveletiJel;
        Scanner beolvas = new Scanner(System.in);
        
        System.out.println("Adja meg az első számot:"); 
        elsoSzam = Float.parseFloat(beolvas.nextLine());
        System.out.println("Adja meg a második számot:");
        masodikSzam = Float.parseFloat(beolvas.nextLine());
        System.out.println("Adja meg a műveletet:");
        muveletiJel = beolvas.next().charAt(0);
                System.out.println("Adja meg a műveletet2:");
        char mj = beolvas.next().charAt(0);
        System.out.println(mj);
        if(muveletiJel == '+'){
            float osszeg = elsoSzam + masodikSzam;
            System.out.println("A két számnak az összege: " + osszeg);
            
        }
        else{
            if(muveletiJel == '-'){
                float kulombseg = elsoSzam - masodikSzam;
                System.out.println("A két számnak az külömbsége: " + kulombseg);    
            }
            else{
                if(muveletiJel == '*'){
                    float szorzat = elsoSzam * masodikSzam;
                    System.out.println("A két számnak a szorzata: " + szorzat);    
                }
                else{
                    if(muveletiJel == '/'){
                        float hanyados = elsoSzam / masodikSzam;
                        System.out.println("A két számnak a hányadosa: " + hanyados);    
                    }
                    else{
                        System.out.println("A beírt műveleti jel érvénytelen!");
                    }        
                }    
            }
        } 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cast;

/**
 *
 * @author bence
 */
public class Cast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //impl. tip.konv.
        int elsoValtozo = 5;
        char karakter = 'a';
        double masodikValtozo;
        masodikValtozo = elsoValtozo;
        float harmadikValtozo = elsoValtozo;
        byte egyBajt = 25;
        float egyBajtFloat = egyBajt;
        int karakterSzam = karakter;
        System.out.println(egyBajtFloat);
        System.out.println(karakterSzam);
        System.out.println(elsoValtozo);
        System.out.println(masodikValtozo);
        System.out.println(harmadikValtozo);
        //expl.tip.konv.
        System.out.println("Expl.:");
        double doubleValtozo = 2.66;
        System.out.println(doubleValtozo);
        int integerValtozo = (int) doubleValtozo;
        System.out.println(integerValtozo);
        integerValtozo = (int) 4.85;
        System.out.println(integerValtozo);
        float tortFloat = (int) doubleValtozo;
        System.out.println(tortFloat);
        

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomb_muveletek;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Tomb_muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] egyTomb = new int[50];
       /* egyTomb[0] =(int)(Math.random()*100);
        egyTomb[1] =(int)(Math.random()*100);*/
       
       for(int i=0; i<egyTomb.length;i++){
            egyTomb[i] = (int)(Math.random()*100); //Math.random()-> 0.0-1.0 közötti értékeket ad 
        }
       for(int i=0;i<egyTomb.length;i++){
           System.out.println("A " + (i+1) + ". elem:" + egyTomb[i]);
       }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a keresendő elemet:");
        int keresendomElem = Integer.parseInt(scanner.nextLine());
        int i=0;
        while(i<egyTomb.length && egyTomb[i]!=keresendomElem){
        i++;
        }
        if(i<egyTomb.length){
            System.out.println("A keresett elem a(z) " + (i+1) + ". helyen van");
        }
        else{
            System.out.println("A keresett elem nem található a tömben.");
        }
        
        int legkisebbElem = egyTomb[0];
        for(i=1;i<egyTomb.length;i++){
            if(egyTomb[i]<legkisebbElem){
            legkisebbElem = egyTomb[i];
            }
        }
        System.out.println("A legkisebb elem az " + legkisebbElem);
        
        
        int legnagyobbElem = egyTomb[0];
        for(i=1;i<egyTomb.length;i++){
            if(egyTomb[i]>legnagyobbElem){
            legnagyobbElem = egyTomb[i];
            }
        }
        System.out.println("A legnagyobb elem a " + legnagyobbElem);
        
    }
    
}

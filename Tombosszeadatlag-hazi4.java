/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombosszeadatlag;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Tombosszeadatlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] egeszTomb = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<egeszTomb.length;i++){
            System.out.println("Add meg a tömb " + (i+1) + ". elemét");
            egeszTomb[i] = Integer.parseInt(sc.nextLine());
        }
        int sum = 0;
        for (int i = 0; i < egeszTomb.length; i++) {
            sum+=egeszTomb[i];
        }
        System.out.println("A tömbben lévő elemek összege:" + sum);
        System.out.println("A tömbben lévő elemek átlaga:" +((float)sum/egeszTomb.length));
    }
    
}

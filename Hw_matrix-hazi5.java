/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_matrix;

import java.util.Scanner;

/**
 *
 * @author bence
 */
public class Hw_matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String[][] m1 = new String[3][3];
            Scanner sc = new Scanner(System.in);
            
            for(int i=0;i<m1.length;i++){
                for(int j=0;j<m1[i].length;j++){
                    if(j==0){
                        System.out.println("Adja meg a(z)" +(i+1)+ ". embernek a nevét:");
                        m1[i][j]=sc.nextLine();
                    }
                    else if(j==1){
                        System.out.println("Adja meg a(z)" + (i+1) +". embernek a születési helyét:");
                        m1[i][j]=sc.nextLine();
                    }
                    else if(j==2){
                         System.out.println("Adja meg a(z)" + (i+1) +". embernek a lakhelyét:");
                            m1[i][j]=sc.nextLine();
                    }
                }
            }
            
            
            for(int i=0;i<m1.length;i++){
                for(int j=0;j<m1[i].length;j++){
                    if(j==0){
                        System.out.println((i+1) + ". embernek a neve:" + m1[i][j]);
                    }
                    else if(j==1){
                        System.out.println((i+1) + ". embernek a születési helye:" + m1[i][j]);

                    }
                    else if(j==2){
                        System.out.println((i+1) + ". embernek a lakhelye:" + m1[i][j]);
                    }
                    
                }
                                    System.out.println("");

            }
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pp
 */
public class Fileread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] matrix = new String[4][3];
        try{
            File file1 = new File("file.txt");
            Scanner scanner = new Scanner(file1);
            int i=0;
            while(scanner.hasNextLine()){
                   matrix[i]=scanner.nextLine().split(";");
                   i++;
            }
            scanner.close();
        }
        catch(Exception e){
            System.err.println("HIBA");
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}

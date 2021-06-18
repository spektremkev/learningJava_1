/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Random;

/**
 *
 * @author gabri
 * headquarters 
 */
public class program_37 {
    
    
    public static void main(String[] args) {
        

        double [][] spac = new double [365][365];
     
       Random spacr = new Random();
       
     for (int i = 0; i < spac.length; i++) {
         for (int j = 0; j < spac[i].length; j++) {
             spac[i][j] = spacr.nextInt();
         }
             int j = 0;
               System.out.println("numeber - " + spac[i][j]);
        }
     //size check
    int bigger = 0 ;
    int line = 0;
    int column = 0;
    
     for (int i = 0; i < spac.length; i++) {
         for (int j = 0; j < spac[i].length; j++) {
             int[][] sapc = null;
    
             if (sapc[i][j] > bigger) {
                 bigger = (int) spac[i][j];
                 line = i;
                 column = j;
             }
         }
        }
     
     System.out.println(bigger);
     System.out.println(line);
     System.out.println(column);
     
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author gabri
 */
public class program_36 {
    public static void main(String[] args) {
        
        double [] space = new double [365];
         Random spacr = new Random();
         
      System.out.println(space[0]);
      System.out.println(space.length);  
      System.out.println("show memory addresses "+space);
      
      //for standard 
        for (int i = 0; i < space.length; i++) {
                System.out.println(space[i]);
        }
      System.out.println("for starting of the version 5.1");
        for (double temp : space) {
            System.out.println(temp);
            
        }
      
 }
}
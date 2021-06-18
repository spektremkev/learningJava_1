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
 * 
 * For Each
 */
public class program_38 {
    
    public static void main(String[] args){
    
    int [] space = new int[10];
    
    Random spacr = new Random();
    
        for (int i = 0; i < space.length; i++) {
            space[i] = spacr.nextInt(10);
        }
        
        for (int i = 0; i < space.length; i++) {
           // int space = space[i];
                    
             System.out.println(space[i]);
        }
    System.out.println(" For Each");
    
        //only in version 5 
        // for(int space : space) {
       //     System.out.println(space);
      //  }
    }
}


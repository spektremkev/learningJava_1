/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

/**
 *
 * @author gabri
 * 
 * Vetores/Arrays
 */
public class program_32 {
    public static void main(String[] args) {
 
    int i;
    int [] x  = new int[10];
    
    /*
    for ( i=0; i< x.length; ++i ){
        x[i]=50;
    }
    */
    
    java.util.Arrays.fill(x,3);
    
              for ( i=0; i< x.length; ++i ){
        System.out.println(x[i]);
    }
    
              
              
    }
}
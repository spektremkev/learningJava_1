/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;
import java.util.Scanner;


/**
 *
 * @author gabri
 * 
 * Operadores Lógicos && e ||
 */
public class program_20 {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.println("incira um numero inteiro:");
     int numero = input.nextInt();
     
     if ( numero % 2 != 0 )
     System.out.println("Teste impar");
    
    if ( numero % 2 == 0 ){
     System.out.println("Teste impar");
    }
        
    if((numero % 2 == 0) || (numero < 20)){
        System.out.println("OK");
 }
    
    
}
  }
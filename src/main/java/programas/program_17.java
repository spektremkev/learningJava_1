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
 */
public class program_17 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o seu primeiro nome?");
        String PrimeiroNome = input.next();
        
        System.out.println("Qual o seu ultimo nome?");
        String ultimoNome = input.next();        
        
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();  
        
    System.out.println("Ola " + PrimeiroNome + " " + ultimoNome + " de " + idade + " anos");
    
    }
}

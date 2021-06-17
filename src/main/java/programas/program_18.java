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
 * IF ELSE
 * 
 */
public class program_18 {
    
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);   
    
    System.out.println("Qual o seu nome?");
        String nome = input.nextLine();
    
     System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        
        
        if(idade < 18 ){
        System.out.println("Você é menor de idade");
        }
        
        if(idade <= 18 ){
        System.out.println("Você é menor igual a idade");
        }
        
        if(idade > 18 ){
        System.out.println("Você é maior  idade");
        }
        
        if(idade >= 18 ){
        System.out.println("Você é maior igaul" + " idade");
        }
        
        if(idade == 18 ){
        System.out.println("Você é igual idade");
        }
    }
}

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
public class program_13 {
    
     public static void main(String[] args) {
         
    final double Pi = 3.1415926535;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe o valor do raio");
    double raio = input.nextDouble();
    
    double area = raio*raio*Pi; 
    
    System.out.println("arrea do circulo e  = " + area);
    
    
}
}
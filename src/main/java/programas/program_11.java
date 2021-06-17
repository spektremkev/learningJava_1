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
public class program_11 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System .in);
        double base, altura, areaRetangulo;
        
        
        System .out.println("Informe o valor da base : ");
        base = input.nextDouble();
        
        System .out.println("Informe o valor da altura : 5678");
        altura = input.nextDouble();
        
        
        /*
        base   = 10.34;
        altura = 14.54;
        */
        
        areaRetangulo = base * altura;
        
        
        System .out.println("A area de um retangulo :" + base );
        System .out.println(" e altura :" + altura);
        System .out.println("é " + areaRetangulo);
        
    }
    
    }


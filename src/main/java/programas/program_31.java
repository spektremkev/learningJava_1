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
public class program_31 {
    
     public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numAlunos = 5;
        
        double[] notaAlunos = new double[numAlunos];

        for(int i = 0; i < numAlunos; ++i){
            System.out.println("Insira a nota do " + (i+1) + "° aluno.");
        notaAlunos[i] = input.nextDouble();
        }

        for(int i = 0; i < numAlunos; ++i){
            System.out.println("-> " + notaAlunos[i]);
        }

    }
    
}

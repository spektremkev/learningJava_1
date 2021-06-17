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
public class program_27 {
    
        public static void main(String[] args){

     Scanner input = new Scanner(System.in);

        System.out.println("Selecione um numero de 1 a 5:");
        int num = input.nextInt();

            switch(num){
            case 1:
            System.out.println("Voce escolheu 1.");
            break;
            case 2:
            System.out.println("Voce escolheu 2.");
            break;
            case 3:
            System.out.println("Voce escolheu 3.");
            break;
            case 4:
            System.out.println("Voce escolheu 4.");
            break;
            case 5:
            System.out.println("Voce escolheu 5.");
            break;
            default:
            System.out.println("pao com mortadela.");
            }

     }
}

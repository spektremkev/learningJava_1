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
 * ano é bissexto
 */

public class program_21 {
 public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);
 
 System.out.println("Insira um ano:");
 int ano = input.nextInt();
 
 boolean x = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
 
System.out.println(x);
 
 }
}
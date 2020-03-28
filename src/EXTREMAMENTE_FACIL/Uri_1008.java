/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Uri_1008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada .nextInt();
        int hrs = entrada .nextInt();
        double sal = entrada .nextDouble();
        
        double salario= hrs*sal;
        
        System.out.println("NUMBER = " +num);
        System.out.printf("SALARY = U$ %.2f%n",salario);
        
    }
}

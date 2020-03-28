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
public class Uri_1009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      String nome = entrada.next();
      double sal = entrada.nextDouble();
      double vendas=entrada.nextDouble();
      
      double total = ((vendas*15)/100)+sal;
        System.out.printf("TOTAL = R$ %.2f%n ",total);
    }
}

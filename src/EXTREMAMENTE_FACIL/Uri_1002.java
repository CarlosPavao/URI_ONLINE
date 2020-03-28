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
public class Uri_1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double raio = entrada .nextDouble();
        double n = 3.14159;
        double area = n*(raio*raio);
               System.out.format("A=%.4f%n ",  area);
    }
}

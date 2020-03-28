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
public class Uri_1012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada .nextDouble();
        double B = entrada .nextDouble();
        double C = entrada .nextDouble();
        
        double tri = (A*C)/2;
        double circ = (C*C)*3.14159;
        double trap = (C*(A+B))/2;
        double quad= B*B;
        double reta= A*B; 
      
        System.out.printf("TRIANGULO: %.3f%n",tri);
        System.out.printf("CIRCULO: %.3f%n",circ);
        System.out.printf("TRAPEZIO: %.3f%n",trap);
        System.out.printf("QUADRADO: %.3f%n",quad);
        System.out.printf("RETANGULO: %.3f%n",reta);
    }
}

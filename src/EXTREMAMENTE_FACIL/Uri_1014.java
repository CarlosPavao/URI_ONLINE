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
public class Uri_1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada .nextInt();
        double y = entrada.nextDouble();
        
        double consumo = x/y;
        
        System.out.printf("%.3f km/l%n",consumo);
        
    entrada.close();
    
    }
}

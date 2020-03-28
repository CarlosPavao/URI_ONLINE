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
public class Uri_1017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       int horas = entrada .nextInt();
       int vel = entrada .nextInt();
       
       double gasto = (horas*vel)/12.0;
       
        System.out.printf("%.3f%n",gasto);
    }
}

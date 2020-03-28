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
public class Uri_1013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a=entrada .nextInt();
        int b=entrada .nextInt();
        int c=entrada .nextInt();
        
        int ab = (a+b+ Math.abs (a-b))/2;
        int abc = (ab+ c + Math.abs (ab-c))/2;
        System.out.println(abc + " eh o maior");
       
    }
}

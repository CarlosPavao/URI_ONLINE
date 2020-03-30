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
public class Uri_1019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int A = entrada .nextInt();
        int qtdhoras = A/3600;
        A= A%3600;
        int qtdminutos = A/60;
        A=A%60;
        int qtdseg = A/1;
        A=A%1;
        System.out.println(qtdhoras+":"+qtdminutos+":"+qtdseg);
  
   entrada.close();
  }
}

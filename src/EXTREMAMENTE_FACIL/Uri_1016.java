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
public class Uri_1016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
                int distancia = entrada.nextInt();
         
         int tempo = (60*distancia)/30;
         
         System.out.println(tempo+" minutos");
    }
}

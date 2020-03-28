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
public class Uri_1007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada .nextInt();
        int B = entrada .nextInt();
        int C = entrada .nextInt();
        int D = entrada .nextInt();
                
        int DIFERENCA = (A*B)-(C*D);
        System.out.println("DIFERENCA = "+DIFERENCA);
        
    }
}

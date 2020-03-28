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
public class Uri_1015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       double x1 =entrada .nextDouble();
       double y1 =entrada .nextDouble();
       double x2 =entrada .nextDouble();
       double y2 =entrada .nextDouble();
       
       double distanciaxy = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    //Math.sqrt = raiz quadrada
    //Math.pow = elevado
              
        System.out.printf("%.4f%n", distanciaxy);
    }
}

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
public class Uri_1005 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A=entrada .nextDouble();
             double B=entrada .nextDouble();
             double MEDIA = ((A*3.5)+(B*7.5))/11;
        System.out.printf("MEDIA = %.5f%n ", MEDIA);
    }
}
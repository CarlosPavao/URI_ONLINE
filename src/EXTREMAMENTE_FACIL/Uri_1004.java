package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada .nextInt();
        int b = entrada .nextInt();
        
        entrada.close();
        
        int prod = a*b;
        
        System.out.println("PROD = " + prod);
    }
}

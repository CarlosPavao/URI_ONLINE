package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
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
    
    entrada.close();
    
    }
}

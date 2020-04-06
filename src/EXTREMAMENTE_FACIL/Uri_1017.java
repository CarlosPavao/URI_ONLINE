package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       int horas = entrada .nextInt();
       int vel = entrada .nextInt();
       
       double gasto = (horas*vel)/12.0;
       
        System.out.printf("%.3f%n",gasto);
        
        entrada.close();
    }
}

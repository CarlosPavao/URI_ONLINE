package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      String pessoa = entrada.next();
      double sal = entrada.nextDouble();
      double vendas=entrada.nextDouble();
      
      double total = ((vendas*15)/100)+sal;
        System.out.printf("TOTAL = R$ %.2f%n ",total);

    entrada.close();
    }
}

package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1006 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      double A=entrada .nextDouble();
      double B=entrada .nextDouble();
      double c=entrada .nextDouble();
      
      entrada.close();
      
      double MEDIA = ((A*2)+(B*3)+(c*5))/10;
        System.out.printf("MEDIA = %.1f%n ", MEDIA);
    }
}


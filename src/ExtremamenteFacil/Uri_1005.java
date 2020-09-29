package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1005 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double A=entrada .nextDouble();
             
        entrada.close();

        double B=entrada .nextDouble();
        double MEDIA = ((A*3.5)+(B*7.5))/11;
        System.out.printf("MEDIA = %.5f%n ", MEDIA);
    }
}

package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
double R = entrada.nextDouble();
double pi =  3.14159;
double volume = (4/3.0)*pi*(R*R*R);
        System.out.printf("VOLUME = %.3f%n",volume);
    
    entrada.close();
    }    
   
}

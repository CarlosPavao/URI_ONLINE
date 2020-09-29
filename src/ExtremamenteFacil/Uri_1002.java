package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double raio = entrada .nextDouble();
        
        entrada.close();
        
        double n = 3.14159;
        double area = n*(raio*raio);
               System.out.format("A=%.4f%n ",  area);
    }
}

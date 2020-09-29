package ExtremamenteFacil;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */

import java.util.Scanner;

public class Uri_1060 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        
        for (int i=0; i < 6; i++) {
        double numeros = entrada.nextDouble();
        if (numeros > 0) cont++;
    }
        System.out.println(cont + " valores positivos");
        
        entrada.close();
    }
}
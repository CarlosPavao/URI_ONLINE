package EXTREMAMENTE_FACIL;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int NumeroValido = 0;
        double somaValido = 0;
        

        for (double i=0; i < 6; i++) {
            double numero = entrada.nextDouble();
            if (numero > 0) {
                NumeroValido++;
                somaValido += numero;
            }
        }
        double media = somaValido/NumeroValido;

        System.out.println(NumeroValido + " valores positivos");
        System.out.printf("%.1f\n", media);
        
        entrada.close();
    }
}
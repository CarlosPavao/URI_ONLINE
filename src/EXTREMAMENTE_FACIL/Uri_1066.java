package EXTREMAMENTE_FACIL;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int par = 0,impar = 0,positivo = 0,negativo = 0,numero;

        for(int i = 0; i < 5; i++){
            numero = entrada.nextInt();
            
            if(numero%2 == 0)
                par++;
            else
                impar++;
            if(numero > 0)
                positivo++;
            else if(numero < 0)
                negativo++;
        }    
                System.out.printf("%d valor(es) par(es)\n",par);
                System.out.printf("%d valor(es) impar(es)\n",impar);
                System.out.printf("%d valor(es) positivo(s)\n",positivo);
                System.out.printf("%d valor(es) negativo(s)\n",negativo);
    entrada.close();   
    }
}
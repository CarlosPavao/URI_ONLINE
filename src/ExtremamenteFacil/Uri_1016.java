package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
                int distancia = entrada.nextInt();
         
         int tempo = (60*distancia)/30;
         
         System.out.println(tempo+" minutos");

    entrada.close();
    }
}

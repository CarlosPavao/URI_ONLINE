package EXTREMAMENTE_FACIL;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */

import java.util.Scanner;

public class Uri_1070 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int impar, contador = 0;

        impar = entrada.nextInt();

        while(contador<6){
            if(impar%2 != 0){
                System.out.println(impar);
                contador++;
            }
            impar++;
        }

    entrada.close();    
    }
}
    
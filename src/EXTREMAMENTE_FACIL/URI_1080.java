package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class URI_1080 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, maior=0;
        int posicao=1;
        for(int i=1; i <= 100; i++){
            valor = entrada.nextInt();

            if(i == 1){
                maior = valor;
                posicao = 1;
            }else if(valor > maior){
                maior = valor;
                posicao= i;
            }
        }
        System.out.printf("%d\n %d\n",maior, posicao);
    entrada.close();
    }
}
package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/*
 QUESTÃO
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a 
 seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve 
 apresentar a soma de todos os ímpares existentes entre X e Y.
 
 ENTRADA
 A primeira linha de entrada é um inteiro N que é a quantidade de casos 
 de teste que vem a seguir. Cada caso de teste consiste em uma linha 
 contendo dois inteiros X e Y.
 
 SAÍDA
 Imprima a soma de todos valores ímpares entre X e Y.
*/
// @author Carlos Pavão <carlos.henrique93@msn.com>

public class Uri_1099 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int casos, x, y;
        int soma;
        

        casos = entrada.nextInt();

        for(int i =0; i < casos; i++){
            soma=0;

            x = entrada.nextInt();
            y = entrada.nextInt();
            
            if(y>x){
                for (int j = x+1; j < y; j++) {
                    if (j % 2 != 0) soma += j;
                }
            } else {
                for (int j = y+1; j < x; j++) {
                    if (j % 2 != 0) soma += j;
                }
            }
            
        System.out.println(soma);
        }
    entrada.close();
    }
}
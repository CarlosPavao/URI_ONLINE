package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/* 
Escreva um programa que leia 2 valores X e Y e que imprima 
todos os valores entre eles cujo resto da divisão dele por 
5 for igual a 2 ou igual a 3.
Entrada:
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, 
não necessariamente em ordem crescente.
Saída:
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
 */
public class Uri_1133RestoDaDivisao {
    //@CarlosPavao
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int x,y;
        int resto = 0;

        x=entrada.nextInt();
        y=entrada.nextInt();
        
        if(x > y){
            int aux = x;
            x = y;
            y = aux;
        }

        for(int i = (x+1); i < y; i++){
            resto = i % 5; 
            if(resto == 2 || resto == 3){
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
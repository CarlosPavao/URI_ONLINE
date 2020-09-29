package ExtremamenteFacil;

import java.util.Scanner;

/* 
Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
Este N é a quantidade de linhas de saída que serão apresentadas na 
execução do programa.
Entrada:
O arquivo de entrada contém um número inteiro positivo N.
Saída:
Imprima a saída conforme o exemplo fornecido. 
*/

public class Uri_1143QuadradoeCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N = entrada.nextInt();
        //verificar se o numero esta dentro da condição
        if (N >= 1 && N <= 1000) {
            //
            for(int i=1; i <= N; i++){
                /* System.out.printf("%d %d %d \n",i,(int)Math.pow(i, 2),(int)Math.pow(i, 3) ); */
                
                int sq = (int) Math.pow(i, 2);
                int malti = i * sq;
                System.out.println(i + " " + sq + " " + malti);
            }
            
        }
        entrada.close();
    }
}

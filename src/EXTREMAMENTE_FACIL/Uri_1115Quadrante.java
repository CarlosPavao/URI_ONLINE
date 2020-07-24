package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/* 
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
indeterminada de pontos no sistema cartesiano. Para cada ponto 
escrever o quadrante a que ele pertence. O algoritmo será encerrado 
quando pelo menos uma de duas coordenadas for NULA (nesta situação 
sem escrever mensagem alguma).
Entrada:
A entrada contém vários casos de teste. Cada caso de teste contém 
2 valores inteiros.
Saída:
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se 
encontra a coordenada lida, conforme o exemplo.
 */

public class Uri_1115Quadrante{
    //@CarlosPavao
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        /* x=entrada.nextInt();
        y=entrada.nextInt(); */
        while( ((x = entrada.nextInt()) !=0) && ((y = entrada.nextInt()) != 0)) {
            if(x>0 && y>0){
                System.out.println("primeiro");
            }else if(x<0 && y>0){
                System.out.println("segundo");
            }else if(x<0 && y<0){
                System.out.println("terceiro");
            }else if(x>0 && y<0){
                System.out.println("quarto");
            }
        }

        entrada.close();
    }
}
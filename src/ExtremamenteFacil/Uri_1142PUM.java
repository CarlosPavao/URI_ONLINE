package ExtremamenteFacil;
import java.util.Scanner;

/* 
Escreva um programa que leia um valor inteiro N. Este N é a quantidade 
de linhas de saída que serão apresentadas na execução do programa.
Entrada:
O arquivo de entrada contém um número inteiro positivo N.
Saída:
Imprima a saída conforme o exemplo fornecido. 
*/
/*
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */

public class Uri_1142PUM {

        //@CarlosPavao
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
            
        int x;
        int y=0;

        x=entrada.nextInt();

        for(int i =0; i<x;i++){
            System.out.printf("%d %d %d PUM\n",y+1,y+2,y+3 );
            y+=4;
        }
        entrada.close();
    }
}

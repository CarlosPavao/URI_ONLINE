/*Você deve fazer um programa que leia um valor qualquer e apresente uma 
mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], 
(75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum 
destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.
*/
package EXTREMAMENTE_FACIL;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);
        
        double a = entrada.nextDouble();
        
        if(a>=0 && a<=25){
            System.out.println("Intervalo [0,25]");
        }
        else if(a>=25.01 && a<=50){
            System.out.println("Intervalo (25,50]");
        }
        else if(a>=50.01 && a<=75){
            System.out.println("Intervalo (50,75]");
        }
        else if(a>=75.01 && a<=100){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }  
        
    entrada.close();
    }
}

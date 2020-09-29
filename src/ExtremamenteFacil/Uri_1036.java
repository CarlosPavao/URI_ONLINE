package ExtremamenteFacil;
/**Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
 *Bhaskara. Se não for possível calcular as raízes, mostre a mensagem 
 *correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de 
 * numero negativo.
Entrada
Leia três valores de ponto flutuante (double) A, B e C.
Saída
* Se não houver possibilidade de calcular as raízes, apresente a mensagem 
* "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 
* dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
* Imprima sempre o final de linha após cada mensagem.
 */


import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1036 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.ENGLISH);
        double a =entrada.nextDouble();
        double b =entrada.nextDouble();
        double c =entrada.nextDouble();
        
        if ((a == 0) || (((b*b) -(4*a*c)) < 0)) {
			System.out.print("Impossivel calcular\n");
        }
        else {
		double R1 =((-b + Math.sqrt(((b*b)-(4*a*c))))/(2*a));
                double R2 =((-b - Math.sqrt(((b*b)-(4*a*c))))/(2*a));
			
		System.out.printf("R1 = %.5f\n", R1);
		System.out.printf("R2 = %.5f\n", R2);
        }
   
    entrada.close();
    
    }
}

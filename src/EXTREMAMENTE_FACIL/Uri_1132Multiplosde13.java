package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/* Escreva um algoritmo que leia 2 valores inteiros X e Y 
calcule a soma dos números que não são múltiplos de 13 
entre X e Y, incluindo ambos.
Entrada:
O arquivo de entrada contém 2 valores inteiros quaisquer, 
não necessariamente em ordem crescente.
Saída:
Imprima a soma de todos os valores não divisíveis por 13 
entre os dois valores lidos na entrada, inclusive ambos se for o caso.
 */
public class Uri_1132Multiplosde13 {
    //@CarlosPavao
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		int Valor1,valor2,soma;
		soma = 0;
		
		Valor1 = entrada.nextInt();
		valor2 = entrada.nextInt();
        entrada.close();
		if(valor2>Valor1){
			int aux = valor2;
			valor2 = Valor1;
			Valor1 = aux;
		}


		for(;Valor1>=valor2;valor2++){ 
			if(valor2%13 !=0)
				soma +=valor2;
		}

        System.out.println(soma);
    }
}
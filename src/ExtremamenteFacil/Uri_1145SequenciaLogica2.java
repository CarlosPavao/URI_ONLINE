package ExtremamenteFacil;

import java.util.Scanner;

/* 
Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, 
passando para a próxima linha a cada X números.
Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, 
conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
 */
public class Uri_1145SequenciaLogica2 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int NumPorLinha, sequenciaAteY;

        NumPorLinha = entrada.nextInt();
        sequenciaAteY = entrada.nextInt();
        int i=1;
        while(i<=sequenciaAteY){
            
            for(int j = i; j<NumPorLinha; j++){
                System.out.print(j++ + " " );
            }
            System.out.print("\n");
        
        }
    }
}
/* int X,Y;
		Scanner input =new Scanner(System.in);
		X = input.nextInt();
		Y = input.nextInt();
		for (int i = 1; i <= (Y); i+=3) {
			for (int j = i; j <= i+(X - 1); j++) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}

	} */
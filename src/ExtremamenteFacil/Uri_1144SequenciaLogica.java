package ExtremamenteFacil;

import java.util.Scanner;

/* 
Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída 
serão apresentadas na execução do programa, seguindo a lógica do exemplo 
abaixo. Para valores com mais de 6 dígitos, todos os dígitos devem ser 
apresentados.
Entrada:
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
Saída:
Imprima a saída conforme o exemplo fornecido.
 */
public class Uri_1144SequenciaLogica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        int n = entrada.nextInt();
        if(n >= 1 && n <= 1000){
            for(int i =1; i<=n;i++){
                System.out.println(i + " " + (i*i)+ " " + (i*i*i));
                
                System.out.println(i + " " + (i*i+1)+ " " + (i*i*i+1));
            }
        }
        
        entrada.close();
    }

}

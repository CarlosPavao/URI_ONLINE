/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda 
*para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final 
*do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia 
*utilizada.
*Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter 
*estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de 
*cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

*Entrada
*A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem 
*a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade 
*de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia 
(R:Rato S:Sapo C:Coelho).
*Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de 
*cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com 
*dois dígitos após o ponto.
*/

package EXTREMAMENTE_FACIL;

import java.util.Scanner;

public class Uri_1094 {
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qntdTestes, qntdCobaias = 0;int totalRato = 0; int totalSapo = 0; int totalCoelho = 0;
        int totalCobaias = 0;
        String tipoCobaia;
        float percentualCoelhos, percentualRato, percentualSapo;
            
        qntdTestes = entrada.nextInt();

        for(int i = 1; i <= qntdTestes; i++){
            qntdCobaias = entrada.nextInt();
            tipoCobaia = entrada.next();
            switch(tipoCobaia){
                case "C":
                    totalCoelho += qntdCobaias;
                    break;
                case "R":
                    totalRato += qntdCobaias;                
                    break;
                case "S":
                    totalSapo += qntdCobaias;
                    break;            
            }
            totalCobaias += qntdCobaias;
            }
            
        percentualCoelhos = (float)((totalCoelho*100.00)/totalCobaias); 
        percentualRato = (float)((totalRato*100.00)/totalCobaias);
        percentualSapo = (float)((totalSapo*100.00)/totalCobaias);

        System.out.println("Total: "+totalCobaias+ " cobaias");
        System.out.println("Total de coelhos: "+totalCoelho);
        System.out.println("Total de ratos: "+totalRato);
        System.out.println("Total de sapos: "+totalSapo);

        System.out.printf("Percentual de coelhos: %.2f",percentualCoelhos);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f",percentualRato," %\n");
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f",percentualSapo," %\n");
        System.out.print(" %\n");

    entrada.close();
    }
}
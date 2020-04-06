/*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, 
correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 
1, respectivamente, para cada uma destas notas e mostre esta média acompanhada 
pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a 
mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a 
mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, 
inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame 
obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela 
nota digitada. Recalcule a média (some a pontuação do exame com a média 
anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." 
(caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha 
ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego 
exame) apresente na última linha uma mensagem "Media final: " seguido da média 
final para esse aluno.
                            Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos 
alunos.
                            Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens 
devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o 
enter após o final de cada linha, caso contrário obterá "Presentation Error"..
 */
package EXTREMAMENTE_FACIL;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1039 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.ENGLISH);
        
        float nota1=entrada.nextFloat();
        float nota2=entrada.nextFloat();
        float nota3=entrada.nextFloat();
        float nota4=entrada.nextFloat();
        
        float media=(nota1*2+nota2*3+nota3*4+nota4*1)/10;
        
        if(media>=7){
            System.out.printf("Media: %.1f\n",media);
            System.out.print("Aluno aprovado.\n");
            
        }
        else if(media >=5 && media<7){
            System.out.println("Aluno em exame.");
            float exame=entrada.nextFloat();
            System.out.printf("Nota do exame: %.1f%n",exame);
            float notafinal=(media+exame)/2;
        if(media>=5.0){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
        
        System.out.printf("Media final: %.1f%n",notafinal);
        }
        else if(media<5){
            System.out.printf("Media: %.1f\n",media);
            System.out.print("Aluno reprovado.\n");
        }
        entrada.close();
    }
}
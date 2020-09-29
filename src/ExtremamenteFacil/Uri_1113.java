package ExtremamenteFacil;
/* 
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
Escreva para cada X e Y uma mensagem que indique se estes valores foram 
digitados em ordem crescente ou decrescente.
Entrada:
A entrada contém vários casos de teste. Cada caso contém dois valores 
inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores 
iguais para X e Y.
Saída:
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido 
digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
 */
import java.util.Scanner;

public class Uri_1113 {
// @author Carlos Pavão <carlos.henrique93@msn.com>
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        
        while(!((a=entrada.nextInt()) == (b=entrada.nextInt()))){
            if(a>b){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");            
            }
        }
    entrada.close();
    }
}
package ExtremamenteFacil;
/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, 
mostre os valores em ordem crescente, uma linha em branco e em seguida, 
os valores na sequência como foram lidos.

*/

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1042{
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int n1, n2, n3, min1, min2 = 0, min3 = 0;
        
        n1=entrada.nextInt();
        n2=entrada.nextInt();
        n3=entrada.nextInt();
        entrada.close();
        min1 = Math.min(n1, Math.min(n2, n3));

        if(min1 == n1) {
            min2 = Math.min(n2,n3);
            min3 = Math.min(n2,n3);
        }
        if (min1 == n2){
            min2 = Math.min(n1,n3);
            min3 = Math.min(n1,n3);
        }
        if (min1 == n3){
            min2 = Math.min(n1,n2);
            min3 = Math.min(n1,n2);
        }
        System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
        System.out.print(n1 + "\n" + n2 + "\n" + n3 + "\n");
    
    entrada.close();
    }
}
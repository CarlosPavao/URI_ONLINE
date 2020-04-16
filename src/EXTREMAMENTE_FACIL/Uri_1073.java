package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1073 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int numero, vezes=0;
        

        numero = entrada.nextInt();

        for(int i = 1; i<= numero; i++){
            if( i%2==0){
               vezes = i*i;
                System.out.printf("%d^2 = %d\n",i, vezes);
            }
        }
    entrada.close();    
    }
}
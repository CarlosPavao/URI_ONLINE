package ExtremamenteFacil;

import java.util.Scanner;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1075 {
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner(System.in);

        int divisor, i=0;
        int divisao=0;

        divisor=entrada.nextInt();
        
        entrada.close();   
        
        for(i=0; i <=10000; i++){
            divisao = i%divisor;
            if(divisao==2)
                System.out.println(i);
        }
         
    }
}
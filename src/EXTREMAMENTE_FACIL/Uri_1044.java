package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1044{
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        
        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println( "Sao Multiplos" );
        }
        else{
            System.out.println( "Nao sao Multiplos" );
        }
    entrada.close();
    }

}
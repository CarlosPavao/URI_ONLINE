package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada .nextInt();
        int B = entrada .nextInt();
        int C = entrada .nextInt();
        int D = entrada .nextInt();
                
        int DIFERENCA = (A*B)-(C*D);
        System.out.println("DIFERENCA = "+DIFERENCA);
        
    entrada.close();
    
    }
}

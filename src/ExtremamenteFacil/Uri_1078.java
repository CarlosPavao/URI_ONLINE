package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1078 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int multiplicador, conta=0;
    
        multiplicador=entrada.nextInt();
    
        for(int i =1; i<=10; i++){
            conta = i*multiplicador;
            System.out.println(i+" x "+multiplicador+" = " +conta);    
        }
    entrada.close();
    }
}        
    

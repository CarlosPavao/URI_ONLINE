package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int codigo1 = entrada .nextInt();
            int qntd1 = entrada .nextInt();
            float vlr1 = entrada .nextFloat();
            int codigo2 = entrada .nextInt();
            int qntd2 = entrada .nextInt();
            float vlr2 = entrada .nextFloat();
           
                float total = (qntd1*vlr1)+(qntd2*vlr2);
               
                System.out.printf("VALOR A PAGAR: R$ %.2f%n ",total);
    
    entrada.close();
    }
 
}

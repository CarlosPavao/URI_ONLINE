package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1079 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int qntdteste;

       qntdteste=entrada.nextInt();

       for(int i=0; i < qntdteste;i++){

           double media1 =entrada.nextDouble();
           double media2 =entrada.nextDouble();
           double media3 =entrada.nextDouble();

           double ponderada = ((media1*2.0)+(media2*3.0)+(media3*5.0))/10f;
            System.out.printf("%.1f\n",ponderada);
            
        }
    entrada.close();
    }
}
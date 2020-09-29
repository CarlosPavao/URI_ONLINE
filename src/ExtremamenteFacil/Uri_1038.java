package ExtremamenteFacil;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1038 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        entrada.useLocale(Locale.ENGLISH);
        
        int codigo=entrada.nextInt();
        int quantidade=entrada.nextInt();
        
        if(codigo==1){
            System.out.printf("Total: R$ %.2f%n",quantidade*4.00);
        }
        else if(codigo==2){
            System.out.printf("Total: R$ %.2f%n",quantidade*4.50);
        }
        else if(codigo==3){
            System.out.printf("Total: R$ %.2f%n",quantidade*5.00);
        }
        else if(codigo==4){
            System.out.printf("Total: R$ %.2f%n",quantidade*2.00);
        }
        else if(codigo==5){
            System.out.printf("Total: R$ %.2f%n",quantidade*1.50);
        }
        entrada.close();
    }
    
}

package ExtremamenteFacil;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1071 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2,min,max;
        int soma=0;
        
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        min = Math.min(n1, n2);
        max= Math.max(n1, n2);

        for(int i = min+1; i < max; i++){
            if(i%2 != 0){
                soma +=i;
            }
        }
        
        System.out.println(soma);

    entrada.close();    
    }
}


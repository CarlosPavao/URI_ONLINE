package ExtremamenteFacil;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1065 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int i,positivo = 0;
        int numero;

        for(i = 0; i < 5; i++){
            numero =entrada.nextInt();

            if(numero%2 == 0)
                positivo++;
        }
        System.out.printf("%d valores pares\n",positivo);
    
    entrada.close();    
    }
}
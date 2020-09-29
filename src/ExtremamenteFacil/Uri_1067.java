package ExtremamenteFacil;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1067 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int impar = 0;

        impar = entrada.nextInt();

        for(int i = 1; i <= impar ; i+=2){
            System.out.println(i);
        }
    entrada.close();    
    }
}
package ExtremamenteFacil;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1072 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero,qntd = 0;
        int in = 0;
        int out = 0;
        
        numero=entrada.nextInt();
        
        for(int i= 0; i<numero;i++){
            
            qntd=entrada.nextInt();
            
            if(qntd >=10 && qntd <=20){
                in++;
            }else {
                out++;
            }    
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    
    entrada.close();
    }
}
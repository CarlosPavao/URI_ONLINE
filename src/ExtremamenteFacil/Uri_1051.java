package ExtremamenteFacil;
import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double salario = entrada.nextDouble();
        double imposto = 0f;
        if (salario <= 2000){
           imposto = 0;
           System.out.println("Isento");
        }
        else if(salario > 2000 && salario<= 3000){
            imposto = (salario-2000f)*0.08f;
            System.out.printf("R$ %.2f\n",imposto);
        }
        else if(salario > 3000 && salario <=4500){
            imposto = (salario - 3000.0)*0.18 + (1000*0.08);
            System.out.printf("R$ %.2f\n",imposto);
        }
        else if(salario>4500){
            imposto = (salario -4500.0)*0.28 +(1500.0*0.18)+(1000.0*0.08);
            System.out.printf("R$ %.2f\n",imposto);
        }
    entrada.close();
    }
}
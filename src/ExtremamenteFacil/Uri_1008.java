package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada .nextInt();
        int hrs = entrada .nextInt();
        double sal = entrada .nextDouble();
        
        double salario= hrs*sal;
        
        System.out.println("NUMBER = " +num);
        System.out.printf("SALARY = U$ %.2f%n",salario);
        
    entrada.close();
    }
}

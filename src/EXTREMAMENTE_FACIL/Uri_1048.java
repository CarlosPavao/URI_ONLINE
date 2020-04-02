package EXTREMAMENTE_FACIL;

import java.util.Scanner;

public class Uri_1048{

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        double salario = entrada.nextDouble();

        if(salario <= 400){
            double  reajuste = ((salario*15)/100);
            double salariofinal = reajuste+salario;
            System.out.printf("Novo Salario: %.2f\n",salariofinal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if(salario > 400 && salario <=800){
            double  reajuste = ((salario*12)/100);
            double salariofinal = reajuste+salario;
            System.out.printf("Novo Salario: %.2f\n",salariofinal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if(salario > 800 && salario <=1200){
            double  reajuste = ((salario*10)/100);
            double salariofinal = reajuste+salario;
            System.out.printf("Novo Salario: %.2f\n",salariofinal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if(salario > 1200 && salario <=2000){
            double  reajuste = ((salario*7)/100);
            double salariofinal = reajuste+salario;
            System.out.printf("Novo Salario: %.2f\n",salariofinal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if(salario > 2000){
            double  reajuste = ((salario*4)/100);
            double salariofinal = reajuste+salario;
            System.out.printf("Novo Salario: %.2f\n",salariofinal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 4 %");
        }
    entrada.close();
    }
}

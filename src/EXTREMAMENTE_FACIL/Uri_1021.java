package EXTREMAMENTE_FACIL;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1021 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);
        double valorI = entrada .nextDouble();
        int valor;
        
        System.out.println("NOTAS: ");
        
        valor = (int)valorI/100;
        System.out.printf("%d nota(s) de R$ 100.00%n",valor);
        valorI = valorI%100;
        
        valor = (int)valorI/50;
        System.out.printf("%d nota(s) de R$ 50.00%n",valor);
        valorI = valorI%50;
        
        valor = (int)valorI/20;
        System.out.printf("%d nota(s) de R$ 20.00%n",valor);
        valorI = valorI%20;
        
        valor = (int)valorI/10;
        System.out.printf("%d nota(s) de R$ 10.00%n",valor);
        valorI = valorI%10;
        
        valor = (int)valorI/5;
        System.out.printf("%d nota(s) de R$ 5.00%n",valor);
        valorI = valorI%5;
        
        valor = (int)valorI/2;
        System.out.printf("%d nota(s) de R$ 2.00%n",valor);
        valorI = valorI%2;
        
        
        System.out.println("MOEDAS:");
        
        valor = (int)valorI/1;
        System.out.printf("%d moeda(s) de R$ 1.00%n",valor);
        valorI = valorI%1;
        
        valor = (int) (valorI/0.50);
        System.out.printf("%d moeda(s) de R$ 0.50%n",valor);
        valorI = valorI%0.50;
        
        valor = (int)(valorI/0.25);
        System.out.printf("%d moeda(s) de R$ 0.25%n",valor);
        valorI = valorI%0.25;
        
        valor = (int)(valorI/0.10);
        System.out.printf("%d moeda(s) de R$ 0.10%n",valor);
        valorI = valorI%0.10;
        
        valor = (int)(valorI/0.05);
        System.out.printf("%d moeda(s) de R$ 0.05%n",valor);
        valorI = valorI%0.05;
        
        valor = (int)(valorI/0.01);
        System.out.printf("%d moeda(s) de R$ 0.01%n",valor);
        
        
        
    }
}

package EXTREMAMENTE_FACIL;

import java.util.Scanner;

public class Uri_1043{

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();

        if(n1<n2+n3 && n2<n1+n3 && n3<n1+n2){
            System.out.printf("Perimetro = %.1f\n",n1+n2+n3);
        }
        else{
            System.out.printf("Area = %.1f\n", ((n1+n2)*n3)/2);
        }
    
    entrada.close();
    }
}

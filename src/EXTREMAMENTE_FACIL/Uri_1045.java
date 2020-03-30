package EXTREMAMENTE_FACIL;
/*se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
*se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
*se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
*se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
*se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
*se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
*Entrada
*/
import java.util.Scanner;

public class Uri_1045{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();

        //verificar se a é o maior dos elementos
        if(n1 < n2){
            double aux = n1;
            n1=n2;
            n2=aux;
        }
        
        if(n1 < n3){
            double aux = n1;
            n1=n3;
            n3=aux;
        }
        
        if(n1 < n3){
            double aux = n1;
            n1=n3;
            n3=aux;
        }
        

        if( n1 >= (n2+n3)){
            System.out.print("NAO FORMA TRIANGULO\n");
        }
        else if( n1*n1> ((n2*n2) + (n3*n3))){
            System.out.print("TRIANGULO OBTUSANGULO\n"); 
        }
        if( n1*n1 == ((n2*n2) + (n3*n3))){
            System.out.print("TRIANGULO RETANGULO\n");
        }
        if( n1*n1 < ((n2*n2) + (n3*n3))){
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if((n1 == n2) && (n1 == n3)){
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((n1 == n2) &&(n1 != n3)) || ((n1 == n3) && (n1 != n2)) || ((n2 == n3) && (n2 != n1))) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }

    
    entrada.close();
    }
}
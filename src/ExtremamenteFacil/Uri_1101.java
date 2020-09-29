package ExtremamenteFacil;

import java.util.Scanner;

/*
Leia um conjunto não determinado de pares de valores M e N (parar quando algum 
dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência 
do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N 
e M).
Entrada
O arquivo de entrada contém um número não determinado de valores M e N. 
A última linha de entrada vai conter um número nulo ou negativo.
Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma 
deles, conforme exemplo abaixo.
*/
// @author Carlos Pavão <carlos.henrique93@msn.com>
public class Uri_1101 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, soma;
        
        while(((x = entrada.nextInt()) > 0) && ((y = entrada.nextInt()) > 0)) {
            soma=0;
            if(x < y){
                for(x = x;x <= y; x++){
                    soma+=x;
                    System.out.print(x+" ");
                }
                System.out.print("Sum="+soma+"\n");
            }else{
                for(y = y;y <= x; y++){
                    soma+=y;
                    System.out.print(y+" ");
                    
                }
                System.out.print("Sum="+soma+"\n");
            }
        }
    entrada.close();
    }
}
package ExtremamenteFacil;
/*
 * Leia 2 valores com uma casa decimal (x e y), 
 * que devem representar as coordenadas de um 
 * ponto em um plano. A seguir, determine qual 
 * o quadrante ao qual pertence o ponto, ou se 
 * está sobre um dos eixos cartesianos ou na 
 * origem (x = y = 0).
 * Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou 
“Eixo Y”, conforme for a situação
 */

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1041 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        double eixox=entrada.nextDouble();
        double eixoy=entrada.nextDouble();
        
        if(eixox == 0 && eixoy == 0){
           System.out.println("Origem"); 
        }
        else if(eixox == 0){
            System.out.println("Eixo Y");
        }
        else if(eixoy == 0){
            System.out.println("Eixo X");
        }
        else if(eixox > 0 && eixoy > 0){
        System.out.println("Q1");
        }
        else if(eixox < 0 && eixoy > 0){
            System.out.println("Q2");
        }
        else if(eixox < 0 && eixoy < 0){
            System.out.println("Q3");
        }
        else if(eixox > 0 && eixoy < 0){
            System.out.println("Q4");
        }
    entrada.close();    
    
    }
}


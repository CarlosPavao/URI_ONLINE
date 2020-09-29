package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1049{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome1 = entrada.next();
        String nome2 = entrada.next();
        String nome3 = entrada.next();

        if(nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("carnivoro")){
            System.out.print("aguia\n");
        }
        if (nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("onivoro")){
            System.out.print("pomba\n");
        }
        if (nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("onivoro")){
            System.out.print("homem\n");
        }
        if (nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("herbivoro")){
            System.out.print("vaca\n");
        }
        
        if(nome1.equals("invertebrado") && nome2.equals("inseto") && nome3.equals("hematofago")){
            System.out.print("pulga\n");
        }
        if (nome1.equals("invertebrado") && nome2.equals("inseto") && nome3.equals("herbivoro")){
            System.out.print("largata\n");
        }
        if (nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("hematofago")){
            System.out.print("sanguessuga\n");
        }
        if (nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("onivoro")){
            System.out.print("minhoca\n");
        }
    entrada.close();
    }
}
    

 
package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1050 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int ddd = entrada.nextInt();

        switch(ddd){
            case 61:
            System.out.println("Brasilia");
            break;
            case 71:
            System.out.println("Salvador");
            break;
            case 11:
            System.out.println("Sao Paulo");
            break;
            case 21:
            System.out.println("Rio de Janeiro");;
            break;
            case 32:
            System.out.println("Juiz de Fora");
            break;
            case 19:
            System.out.println("Campinas");
            break;
            case 27:
            System.out.println("Vitoria");
            break;
            case 31:
            System.out.println("Belo Horizonte");
            default:
            System.out.println("DDD nao cadastrado");
        }
    entrada.close();    
    }
}
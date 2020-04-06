package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1046{

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        int horainicio=entrada.nextInt();
        int horafinal=entrada.nextInt();

        if(horafinal == horainicio){
            int duracao = 24;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
        else if(horafinal > horainicio ){
            int duracao = horafinal-horainicio;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
        else if(horafinal < horainicio){
            int duracao = (24+ horafinal)-horainicio;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
    entrada.close();
    }
}
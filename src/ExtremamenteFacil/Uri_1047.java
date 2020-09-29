package ExtremamenteFacil;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1047{

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int horainicial = entrada.nextInt();
        int mininicial = entrada.nextInt();
        int horafinal = entrada.nextInt();
        int minfinal = entrada.nextInt();

        if(horainicial == horafinal && mininicial == minfinal) {
            System.out.println("O JOGO DUROU 24 HORAS(S) E 0 MINUTO(S)");
        }
        else if (horainicial > horafinal){
            int duracao = (24 - horainicial) + horafinal;

            if(mininicial > minfinal){
                int mintotal = ( 60 -mininicial ) +minfinal;
                duracao--;
                System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)\n",duracao,mintotal);
            }
            else if(mininicial <= minfinal){
                int mintotal = minfinal-mininicial;
                System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)\n",duracao,mintotal);
            }
        }
        else if(horainicial<= horafinal){
            int duracao = horafinal-horainicial;
            
            if(mininicial > minfinal){
                int mintotal = 60-mininicial+minfinal;
                duracao--;
                System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)\n",duracao,mintotal);
            }
            else if(mininicial <= minfinal){
                int mintotal = minfinal-mininicial;
                System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)\n",duracao,mintotal);
            }
        }
       
        entrada.close(); 
    }
}
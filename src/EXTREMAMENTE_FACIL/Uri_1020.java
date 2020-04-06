package EXTREMAMENTE_FACIL;

import java.util.Scanner;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = entrada .nextInt();
        
        int ano = idade/365;
        idade=idade%365;
        int mes=idade/30;
        idade=idade%30;
        int dia=idade/1;
        idade=idade%1;
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    
    entrada.close();
    }
}

package DadosRpg;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        int i=0;

        Random dado = new Random();

        for( i=0 ; i<=1 ; i++){
            System.out.println(dado.nextInt(7));
        }
    }
}
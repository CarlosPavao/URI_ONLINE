package EXTREMAMENTE_FACIL;

import java.util.Scanner;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Uri_1074 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
      
        int qntd,n1=0;
      
        qntd = entrada.nextInt();
      
        for(int i=1; i<=qntd;i++){
            n1=entrada.nextInt();
        if(n1>0 && n1%2==0){
          System.out.println("EVEN POSITIVE");
        }else if (n1<0 && n1%2==0){
          System.out.println("EVEN NEGATIVE");
        }else if (n1>0 && n1%2!=0){
          System.out.println("ODD POSITIVE");
        }else if (n1<0 && n1%2!=0){
          System.out.println("ODD NEGATIVE");
        }else if(n1==0){
          System.out.println("NULL");
        }
    }
    entrada.close();
  } 
}
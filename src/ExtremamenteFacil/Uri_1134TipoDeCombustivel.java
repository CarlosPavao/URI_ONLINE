package ExtremamenteFacil;

import java.util.Scanner;

/* 
Um Posto de combustíveis deseja determinar qual de seus produtos 
tem a preferência de seus clientes. Escreva um algoritmo para ler 
o tipo de combustível abastecido (codificado da seguinte forma: 
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código 
inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código 
(até que seja válido). O programa será encerrado quando o código 
informado for o número 4.
Entrada:
A entrada contém apenas valores inteiros e positivos.
Saída:
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de 
clientes que abasteceram cada tipo de combustível, conforme exemplo.
 */
public class Uri_1134TipoDeCombustivel {
    //@CarlosPavao
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        int combustivel = 0;
        
        while(combustivel !=4){
            
            combustivel = entrada.nextInt();
            while (combustivel < 1 || combustivel > 4) {
				combustivel = entrada.nextInt();
			}
            
            switch(combustivel){
                case 1: 
                    alcool++;
                    break;
                case 2: 
                    gasolina++;
                    break;
                case 3: 
                    diesel++;
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");        
        System.out.printf("Alcool: %d\n",alcool);
        System.out.printf("Gasolina: %d\n",gasolina);
        System.out.printf("Diesel: %d\n",diesel);
        entrada.close();
    }
}
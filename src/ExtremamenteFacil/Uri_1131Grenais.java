package ExtremamenteFacil;

import java.util.Scanner;

/* 
A Federação Gaúcha de Futebol contratou você para escrever 
um programa para fazer uma estatística do resultado de vários 
GRENAIS. Escreva um programa para ler o número de gols marcados 
pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem 
"Novo grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta 
for 1, o algoritmo deve ser executado novamente solicitando o número 
de gols marcados pelos times em uma nova partida, caso contrário deve 
ser encerrado imprimindo:
- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de 
GRENAIS (ou "Nao houve vencedor", caso termine empatado).
Entrada:
O arquivo de entrada contém 2 valores inteiros, correspondentes aos 
gols marcados pelo Inter e pelo Grêmio respectivamente. Em seguida 
háverá um inteiro (1 ou 2), correspondente à repetição do programa.
Saída:
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal 
(1-sim 2-nao)". Quando o algoritmo for encerrado devem ser mostradas as 
estatísticas conforme a descrição apresentada acima. Obs: a palavra "Gremio" 
deve ser impressa sem acento, conforme o exemplo abaixo. 
*/
public class Uri_1131Grenais {
    //@CarlosPavao
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int internacional = 0;
        int gremio = 0;
        int empate = 0;
        int repeticao = 1;
        int vitoriaInt = 0;
        int vitoriaGre = 0;
        
        int qntdgrenais = 0;
        
        do{
            qntdgrenais++;
            
            internacional = entrada.nextInt();
            gremio = entrada.nextInt();
            
            if(internacional == gremio){
                empate++;
            }else if(internacional > gremio){
                vitoriaInt++;
            }else{
                vitoriaGre++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            repeticao = entrada.nextInt();
            while (repeticao != 1 && repeticao != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
                repeticao = entrada.nextInt();
			}
        }while(repeticao != 2);
    
        System.out.printf("%d grenais\n",qntdgrenais);
        System.out.printf("Inter:%d\n", vitoriaInt);
        System.out.printf("Gremio:%d\n", vitoriaGre);
        System.out.printf("Empates:%d\n", empate);
        if(vitoriaInt > vitoriaGre){
            System.out.println("Inter venceu mais");
        }else if(vitoriaInt<vitoriaGre){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
    entrada.close();
    }
}

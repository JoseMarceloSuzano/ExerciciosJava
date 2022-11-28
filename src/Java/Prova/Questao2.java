package Java.Prova;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int pontuacao = 0;
        int vitoria  = 3;
        int empate = 1;
        int saldoBr = 0;
        int saldoAdv = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a quantidade de gols do Brasil!");
            int golsBr = leitura.nextInt();
            saldoBr += golsBr;

            System.out.println("Digite a quantidade de gols do adversário!");
            int golsAdv = leitura.nextInt();
            saldoAdv += golsAdv;

            if (golsBr > golsAdv){
                pontuacao += vitoria;

            } else if (golsBr == golsAdv){
                pontuacao += empate;

            } else {
                pontuacao += 0;
            }

        }
        int saldo = saldoBr - saldoAdv;
        System.out.println("A quantidade de pontos do Brasil foi de: " + pontuacao);
        System.out.println("O saldo de gols do Brasil foi: " + saldo);
    }
}
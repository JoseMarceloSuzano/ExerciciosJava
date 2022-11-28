package ExerciciosJava;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int quantidade1 = 0;
        int quantidade2 = 0;
        int quantidade3 = 0;
        int quantidade4 = 0;


        int[] idade = new int[1000];

        for (int i = 0; i < 1000; i++) {
            System.out.println("Digite a idade!");
            idade[i] = leitura.nextInt();

            if (idade[i] == -1) {
                break;

            } else if (idade[i] >= 0 && idade[i] <= 12) {
                quantidade1++;

            } else if (idade[i] >= 13 && idade[i] <= 17) {
                quantidade2++;

            } else if (idade[i] >= 18 && idade[i] <= 60) {
                quantidade3++;

            } else {
                quantidade4++;
            }

        } int soma = quantidade1 + quantidade2 + quantidade3 + quantidade4;

        int q1 = (quantidade1 * 100) / soma;
        System.out.println("A quantidade de pessoas entre 0 e 12 anos é " + quantidade1 + " e a porcentagem é: " + q1 + "%");

        int q2 = (quantidade2 * 100) / soma;
        System.out.println("A quantidade de pessoas entre 13 e 17 anos é " + quantidade2 + " e a porcentagem é: " + q2 + "%");

        int q3 = (quantidade3 * 100) / soma;
        System.out.println("A quantidade de pessoas entre 18 e 60 anos é " + quantidade3 + " e a porcentagem é: " + q3 + "%");

        int q4 = (quantidade4 * 100) / soma;
        System.out.println("A quantidade de pessoas acima de 60 anos é " + quantidade4 + " e a porcentagem é: " + q4 + "%");

    }

}


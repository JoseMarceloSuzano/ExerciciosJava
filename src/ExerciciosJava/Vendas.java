package ExerciciosJava;

import java.util.Scanner;

public class Vendas {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] vendas = new int[5];
        int menor = 0;
        int maior = 0;
        int total = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor da venda!");
            vendas[i] = leitura.nextInt();

            if (i == 0) {
                menor = vendas[i];
                maior = vendas[i];

            } else if (vendas[i] < menor) {
                menor = vendas[i];

            } else if (vendas[i] > maior) {
                maior = vendas[i];

            }

            total += vendas[i];

        }

        float mediaVendas = total / 5f;
        System.out.println("A menor venda é: " + menor);
        System.out.println("A maior venda é: " + maior);
        System.out.println("O total de vendas é: " + total);
        System.out.println("O preço médio das vendas é: " + mediaVendas);


    }
}



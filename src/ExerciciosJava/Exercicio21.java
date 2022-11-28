package ExerciciosJava;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int[] escolha = new int[20];
        int somaPares = 0;
        int somaImpares = 0;

        for(int i = 0; i < 20; i++){
            System.out.println("Digite um numero!");
            escolha[i] = leitura.nextInt();

            if(escolha[i] % 2 == 0){
                somaPares++;

            } else {
                somaImpares++;

            }
        } System.out.println("A quantidade de numeros pares é: " + somaPares + " e a quantidade de ímpares é: " + somaImpares);
    }
}

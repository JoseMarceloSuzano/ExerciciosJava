package ExerciciosJava;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int[] notas = new int[30];
        int soma = 0;

        for(int i = 0; i < 30; i++){
            System.out.println("Digite a nota!");
            notas[i] = leitura.nextInt();
            soma += notas[i];

        }
        int media = soma / 30;
        System.out.println("A média da turma é: " + media);
    }
}

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int maria = 0;
        int joao = 0;
        int jose = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o numero do representante!");
            int escolha = leitura.nextInt();

            if (escolha == 1){
                maria++;

            } else if (escolha == 2){
                joao++;

            } else {
                jose++;
            }
        } if (maria > joao && maria > jose){
            System.out.println("Maria é a nova representante!");

        } else if (joao > jose && joao > maria){
            System.out.println("João é o novo representante!");

        } else {
            System.out.println("José é o novo representante!");
        }
    }
}

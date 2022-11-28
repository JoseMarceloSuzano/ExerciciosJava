package ExerciciosJava;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int counterEvenNumbers = 0;
        int sumEvenNumber = 0;

        while (true){
            System.out.println("Digite um numero!");
            int number = leitura.nextInt();

            if(number % 2 == 0){
                sumEvenNumber += number;
                counterEvenNumbers++;

                if(counterEvenNumbers == 10){
                    break;
                }

            }


        } System.out.println("A soma dos 10 numeros pares digitados é: " + sumEvenNumber);
        leitura.close();
    }
}

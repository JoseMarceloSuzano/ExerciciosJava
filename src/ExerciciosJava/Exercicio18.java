package ExerciciosJava;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int somaImpares = 0;

        for(int i = 0; i < 30; i++){
            System.out.println("Digite um numero!");
            int numeros = leitura.nextInt();

            if(numeros % 2 > 0 && numeros >= 23 && numeros <= 99){
                somaImpares += numeros;

            }
        } System.out.println("A soma dos numeros impares entre 23 e 99 é: " + somaImpares);
        leitura.close();
    }
}

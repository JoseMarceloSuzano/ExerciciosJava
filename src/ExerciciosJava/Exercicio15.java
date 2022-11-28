package ExerciciosJava;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa!");
        double peso = leitura.nextDouble();

        System.out.println("Digite a altura!");
        double altura = leitura.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso!");

        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal!");

        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso!");

        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau 1!");

        } else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau 2!");

        } else {
            System.out.println("Obesidade grau 3!");
        }
    }
}

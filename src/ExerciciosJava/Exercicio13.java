package ExerciciosJava;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

            System.out.println("Digite um numero!");
            int a = leitura.nextInt();

            System.out.println("Digite um numero!");
            int b = leitura.nextInt();

            System.out.println("Digite um numero!");
            int c = leitura.nextInt();

            System.out.println("Digite um numero!");
            int d = leitura.nextInt();

            int calculo = (a * b) - (c * d);
            System.out.println("A diferença entre o produto de a * b - c * d é: " + calculo);

        }
    }


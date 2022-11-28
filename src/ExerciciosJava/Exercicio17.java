package ExerciciosJava;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        float mensalidade = 1000.0f;
        float porcentagem = 0.05f;
        int semestres = 8;

        for(int i = 0; i < semestres - 1; i++){

            float valorAumento = mensalidade * porcentagem;
            mensalidade += valorAumento;

        }

        System.out.println("O valor da mensalidade ao final de 4 anos é: " + mensalidade);
    }
}

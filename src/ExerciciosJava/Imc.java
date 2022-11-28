package ExerciciosJava;
import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        float total = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o seu peso!");
            float peso = leitura.nextFloat();

            System.out.println("Digite sua altura!");
            float altura = leitura.nextFloat();

            float imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                total++;

            }

        }

        System.out.println("A porcentagem de pessoas consideradas normais é: " + total);
    }
}


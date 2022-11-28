package ExerciciosJava2Periodo;

import java.util.Scanner;

public class numerosInteiros {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro numero!");
        int a = leitura.nextInt();

        System.out.println("Por favor, digite o segundo numero!");
        int b = leitura.nextInt();

        int maiorNumero = maior(a, b);
        System.out.println("Maior número: " + maiorNumero);

    }

    public static int maior(int a, int b) {

        if (a > b){
            return a;

        } else {
            return b;

        }
    }
}

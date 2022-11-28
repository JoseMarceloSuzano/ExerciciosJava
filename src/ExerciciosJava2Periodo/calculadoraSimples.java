package ExerciciosJava2Periodo;

import java.util.Scanner;

public class calculadoraSimples {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int escolha = 0;

            escolha = leitura.nextInt();

            int resultado = 0;

            if (escolha == 9) {
                System.out.println("Bye Bye");

            } else if (escolha == 1){


            } else if (escolha == 2){

            } else if (escolha == 3){


            } else if (escolha == 4){

            }

            else {
                System.out.println("Por favor, digite o segundo numero");
                int n1 = leitura.nextInt();

                System.out.println("Por favor, digite o segundo numero!");
                int n2 = leitura.nextInt();
            }
        }

    public static void printMenu(){

        System.out.println("Escolha qual a operação você deseja fazer!");
        System.out.println("1 - soma");
        System.out.println("2 - divisao");
        System.out.println("3 - multiplicacao");
        System.out.println("4 - subtracao");
        System.out.println("5 - sair");

        
    }

    public static int soma(int n1, int n2) {
        return n1 + n2;

    }

    public static int substracao(int n1, int n2){
        return n1 - n2;

    }

    public static int multiplicacao(int n1, int n2){
        return n1 * n2;

    }

    public static int divisao(int n1, int n2){
        return n1 / n2;
    }


}

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário!");
        String nome = leitura.nextLine();

        System.out.println("Digite a quantidade de horas trabalhadas!");
        int horas = leitura.nextInt();

        System.out.println("Digite o valor que o trabalhador ganha por hora!");
        double valorHora = leitura.nextDouble();

        double soma = (valorHora * horas * 4);

        System.out.println("Sr(a) " + nome + " irá receber R$ " + soma);

    }
}

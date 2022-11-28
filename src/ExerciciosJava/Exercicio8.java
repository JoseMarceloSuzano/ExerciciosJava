package ExerciciosJava;

public class Exercicio8 {

    public static void main(String[] args){

        int valor1 = 10;
        int valor2 = 3;

        int auxiliar = valor1;
        valor1 = valor2;
        valor2 = auxiliar;

        System.out.println("Valor 1 é: " + valor1 + " e valor 2 é: " + valor2);
        
    }
}

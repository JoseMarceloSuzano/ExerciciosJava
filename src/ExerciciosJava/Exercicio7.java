package ExerciciosJava;

public class Exercicio7 {

    public static void main(String[] args){

        int somaPares = 0;
        int valor1 = 10;
        int valor2 = 5;
        int valor3 = 23;
        int valor4 = 41;
        int valor5 = 22;


        if (valor1 % 2 == 0){
            somaPares += valor1;

        } if (valor2 % 2 == 0){
            somaPares += valor2;

        } if (valor3 % 2 == 0){
            somaPares += valor3;

        } if (valor4 % 2 == 0){
            somaPares += valor4;

        } if (valor5 % 2 == 0){
            somaPares += valor5;

        }
        System.out.println("A soma dos numeros pares é: " + somaPares);
    }
}

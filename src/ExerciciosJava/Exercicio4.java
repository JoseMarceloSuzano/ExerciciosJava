package ExerciciosJava;

public class Exercicio4 {
    public static void main(String[] args){

        int valor1 = 10;
        int valor2 = 3;
        int restoDivisao = valor1 % valor2;

        if(restoDivisao == 0){
            System.out.println("Divisão de " + valor1 + "por " + valor2 + "é perfeita!");

        } else {
            System.out.println("O resto da divisão de " + valor1 + " por " + valor2 + " é igual a: " + restoDivisao);
        }
    }
}

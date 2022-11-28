package ExerciciosJava;

public class Exercicio10 {

    public static void main(String[] args){

        int sexo = 1;
        float altura = 1.88f;
        double pesoMulher = 62.1 * altura - 44.7;
        double pesoHomem = 72.7 * altura - 58;

        if (sexo == 0){
            System.out.println("Mulher: Peso Ideal = " + pesoMulher);

        } else {
            System.out.println("Homem: Peso Ideal = " + pesoHomem);
        }
    }
}

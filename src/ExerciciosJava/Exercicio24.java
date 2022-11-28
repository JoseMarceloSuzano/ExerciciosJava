package ExerciciosJava;

public class Exercicio24 {

    public static void main(String[] args){

        int soma = 0;

        for(int i = 1; i < 102; i++){
            if (i% 5 == 0){
                continue;

            }
            soma += i;
        }
        System.out.println("O valor da soma é: " + soma);
    }
}

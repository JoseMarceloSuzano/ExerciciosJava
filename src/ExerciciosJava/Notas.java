package ExerciciosJava;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args){
     Scanner leitura = new Scanner(System.in);

     int maior60 = 0;
     int menor60 = 0;
     int dp = 0;

     for(int i = 0; i < 5; i++){
         System.out.println("Digite a nota do aluno!");
         int nota = leitura.nextInt();

         if (nota >= 60){
             maior60++;

         } else if (nota >= 30 && nota <= 59) {
             menor60++;

         } else {
             dp++;
         }

     }

     int porcentagemMaior60 = (maior60 * 100) / 5;
     int porcentagemMenor60 = (menor60 * 100) / 5;
     int porcentagemDp = (dp * 100) / 5;

     System.out.println("A quantidade de alunos que passaram direto é: " + maior60 + " e a porcentagem é: " + porcentagemMaior60);
        System.out.println("A quantidade de alunos de recuperação é: " + menor60 + " e a porcentagem é: " + porcentagemMenor60);
        System.out.println("A quantidade de alunos de dependência: " + dp + " e a porcentagem é: " + porcentagemDp);





    }
}

package ExerciciosJava;

public class Exercicio1 {


    public static void main(String[] args){
        double salarioMensal = 3751.05;

        if (salarioMensal <= 1903.98){
            System.out.println("ISENTO!");

        } else if (salarioMensal >= 1903.99 && salarioMensal <= 2826.66){
            System.out.println("Você se enquadra na faixa de: 7,5% do IR!");

        } else if (salarioMensal >= 2826.67 && salarioMensal <= 3751.05){
            System.out.println("Você se enquadra na faixa de: 15,0% do IR!");

        } else if (salarioMensal >= 3751.06 && salarioMensal <= 4664.68){
            System.out.println("Você se enquadra na faixa de: 22,5% do IR!");

        } else {
            System.out.println("Você se enquadra na faixa de: 27,5% do IR!");
        }
    }
}

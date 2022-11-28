package ExerciciosJava;

public class Exercicio3 {
    public static void main(String[] args){

        int idadeNadador = 11;

        if(idadeNadador <= 7){
            System.out.println("O nadador de enquadra na categoria: Infantil A!");

        } else if(idadeNadador <= 10){
            System.out.println("O nadador se enquadra na categoria: Infantil B!");

        } else if(idadeNadador <= 13){
            System.out.println("O nadador se enquadra na categoria: Juvenil A!");

        } else if(idadeNadador <= 17){
            System.out.println("O nadador se enquadra na categoria: Juvenil B!");

        } else if(idadeNadador <= 60){
            System.out.println("O nadador se enquadra na categoria: Adulto!");

        } else {
            System.out.println("O nadador se enquadra na categoria: Sênior!");
        }
    }
}

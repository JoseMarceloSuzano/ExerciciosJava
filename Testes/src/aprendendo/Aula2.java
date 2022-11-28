package aprendendo;

public class Aula2 {

    public static void main (String[] args){
        String aluno1 = "João";
        String aluno2 = "Maria";

        if (aluno1 == aluno2) {
            System.out.println("É igual!");

        } else {
            System.out.println("Não é igual!");
        }

        if (aluno1.equals(aluno2)) {
            System.out.println("É igual!");

        } else {
            System.out.println("Não é igual!");
        }
    }
}

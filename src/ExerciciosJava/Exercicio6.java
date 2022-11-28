package ExerciciosJava;

public class Exercicio6 {

    public static void main(String[] args){
        float precoEtanol = 5.00f;
        float precoGasolina = 4.69f;
        float calculo = precoEtanol / precoGasolina * 100;

        if(calculo > 70){
            System.out.println("Vale a pena abastecer com gasolina!");

        } else {
            System.out.println("Vale a pena abastecer com etanol!");
        }
    }
}

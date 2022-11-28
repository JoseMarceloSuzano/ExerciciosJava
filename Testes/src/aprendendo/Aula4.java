package aprendendo;

public class Aula4 {

    public static void main(String[] args) {
        numeroAte10(1);
        brasilHexa("Brasil Hexa!!!");
        

    }

    public static void numeroAte10(int numero) {

        System.out.println(numero);
        numero++;

        if (numero < 11) {

            numeroAte10(numero);

        }


        }

    public static void brasilHexa(String x) {

        System.out.println(x);
        int length = x.length();
        if (length > 1) {
            x = x.substring(0, length -1);
            brasilHexa(x);
        }




    }
}

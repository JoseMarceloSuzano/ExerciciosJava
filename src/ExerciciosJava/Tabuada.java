package ExerciciosJava;

public class Tabuada {

    public static void main(String[] args) {

        int max = 5;
        int min = 15;

        for (int i = min; i < max; i++) {
            System.out.print("\t" + i);

        }
        for (int i = min; i < max; i++) {
            System.out.print("\n" + i);

            for (int j = min; j < max; j++) {
                int aux = i * j;
                System.out.print("\t" + aux);
            }
        }
    }
}


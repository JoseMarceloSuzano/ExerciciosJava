package Java.Prova;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int z = 0;
        int branco = 0;
        int nulo = 0;

        for(int i = 0 ; i < 5; i++){
            System.out.println("Digite seu voto!");
            int votos =  leitura.nextInt();

            if (votos == 111){
                x++;

            } else if (votos == 222){
                y++;

            } else if (votos == 333){
                z++;

            } else if (votos == 0){
                branco++;

            } else {
                nulo++;
            }

        }

        System.out.println("O candidato X teve: " + x + " votos!");
        System.out.println("O candidato Y teve: " + y + " votos!");
        System.out.println("O candidato Z teve: " + z + " votos!");
        System.out.println("A quantidade de votos em branco foi: " + branco);
        System.out.println("A quantidade de votos nulos foi: " + nulo);
    }
}

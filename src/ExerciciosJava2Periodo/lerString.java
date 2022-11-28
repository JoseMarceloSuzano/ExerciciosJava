package ExerciciosJava2Periodo;

import java.util.Scanner;

public class lerString {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        String word = leitura.nextLine();

        String changedWord = trim(word);

        System.out.println(changedWord);

    }

    public static String trim(String value) {
        String temp = value;

        while (temp.startsWith(" ")) {
            temp = temp.substring(1);

        }

        while (temp.endsWith(" ")) {
            temp = temp.substring(0, temp.length() - 1);

        }

        return temp;

    }
}

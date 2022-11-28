package ExerciciosJava2Periodo;

import java.util.Scanner;

public class anoNascimento {

    public static void main (String[] args){
        int birthdayYear = readBirthday();
        int age = calcAge(birthdayYear);
        System.out.println("A idade é " + age);

    }

    public static int readBirthday(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento!");
        return scanner.nextInt();

    }

    public static int calcAge(int birthdayYear){
        return 2022 - birthdayYear;
    }
}

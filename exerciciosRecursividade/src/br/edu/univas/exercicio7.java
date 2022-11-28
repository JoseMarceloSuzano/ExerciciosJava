package br.edu.univas;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite a palavra!");
        String palavra = scanner.nextLine();

        if (isPalindrome(palavra)) {
            System.out.println("É um palíndrome!");

        } else {
            System.out.println("Não é um palíndrome!");
        }

    }

    public static boolean isPalindrome(String word) {

        if (word.length() == 1) { //.length para medir tamanho da string
            return true;

        }

        if (word.charAt(0) == word.charAt(word.length() -1)) { // usa charAt para pegar a primeira e a ultima letra da frase
            // e .length para medir o tamanho final da string

            return isPalindrome (word.substring(1, word.length() -1)); //substring utiliza para pegar a string e quebrar em string menores

        }

        return false;

    }
}


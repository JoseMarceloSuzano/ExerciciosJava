package Trabalhos;

import java.util.Scanner;

public class Poligonos {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        String poligonoT = "1. Triângulo";
        String poligonoR = "2. Retângulo";
        String poligonoH = "3. Hexágono";
        String poligonoP = "4. Pentagono Regular";
        String sair = "9. Sair";


        int escolha = 0;

        while (escolha != 9) {

            System.out.println("Escolha qual o polígono que você deseja calcular a área!");
            System.out.println(poligonoT);
            System.out.println(poligonoR);
            System.out.println(poligonoH);
            System.out.println(poligonoP);
            System.out.println(sair);


            try { escolha = leitura.nextInt();

            }
            catch (Exception Error) {
                System.out.println("Escolha uma opção válida!");

            }


            if (escolha == 1) {

                System.out.println("Digite a base do triângulo!");
                float b = leitura.nextFloat();
                System.out.println("Digite a altura do triângulo!");
                float h = leitura.nextFloat();
                float areaTriangulo = (b * h) / 2;

                System.out.println("A área do triângulo é: " + areaTriangulo);


            } else if (escolha == 2) {

                System.out.println("Digite a base do quadrilátero!");
                float b = leitura.nextFloat();
                System.out.println("Digite a altura do quadrilátero!");
                float h = leitura.nextFloat();
                float areaRetangulo = b * h;

                System.out.println("A área do quadrilátero é: " + areaRetangulo);

            } else if (escolha == 3) {

                System.out.println("Digite o comprimento de um dos lados do hexágono!");
                float c = leitura.nextFloat();
                System.out.println("Digite o comprimento da apótema!");
                float a = leitura.nextFloat();
                float areaHexagono = 3 * c * a;

                System.out.println("A área do hexágono é: " + areaHexagono);


            } else if (escolha == 4) {

                System.out.println("Digite o perímetro do pentágono regular!");
                float p = leitura.nextFloat();
                System.out.println("Digite a apótema do pentágono regular!");
                float a = leitura.nextFloat();
                float areaPentagonoRegular = p * a;

                System.out.println("A área do pentágono é: " + areaPentagonoRegular);

            } else if (escolha == 9) {

                leitura.close();

        } else {

                System.out.println("Opção inválida! Por favor, digite uma opção correta!");

            }

        }


    }

}

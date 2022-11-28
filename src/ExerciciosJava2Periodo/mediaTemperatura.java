package ExerciciosJava2Periodo;

import java.util.Scanner;

public class mediaTemperatura {

    public static void main(String[] args){

        int[] weatherAverage = readWeatherAverage();
        int weatherYearAverage = calcWeatherYearAverage(weatherAverage);

        int[] weatherValues = changeWeatherValues(weatherAverage, weatherYearAverage);

    }

    public static int[] readWeatherAverage() {
        int[] weatherAverage = new int[12];

        Scanner leitura = new Scanner(System.in);
        for(int i = 0; i < 12; i++){
            System.out.println("Digite a media de temperatura!");
            weatherAverage[i] = leitura.nextInt();
        }

        return weatherAverage;

    }

    public static int calcWeatherYearAverage(int[] weatherAverage) {

        int sum = 0;
        for (int i = 0; i < weatherAverage.length; i++) {
            sum += weatherAverage[i];

        }

        return sum / weatherAverage.length;
    }

    public static int[] changeWeatherValues(int[] weatherAverage, int weatherYearAverage){
        int[] values = new Int[weatherAverage.length];

        for (int i = 0; i < weatherAverage.length; i++){
            if
        }
    }
}

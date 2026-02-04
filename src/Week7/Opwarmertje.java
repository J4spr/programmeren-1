package Week7;

import java.util.Scanner;

public class Opwarmertje {
    public static void main(String[] args) {
        final int NUMBER_OF_TEMPERATURES = 7;
        Scanner sc = new Scanner(System.in);
        double[] temperatureArray = new double[NUMBER_OF_TEMPERATURES];
        double input;
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.print("Geef een temperatuur in: ");
            input = sc.nextDouble();
            temperatureArray[i] = input;
        }
        sc.nextLine();
//        double[] temperatureArray = {15.5, 12, 13.8, 14.8, 17, 16.5, 17};

        System.out.println("Overzicht: ");
        System.out.println("=================");
        for (int j = 0; j < temperatureArray.length; j++) {
            System.out.printf("Dag: %d: %.1f\n", j + 1, temperatureArray[j]);
        }

        System.out.printf("average: %.2f\n", calculateAverage(temperatureArray));

    }

    static double calculateAverage(double[] arr) {
        double sum = 0;
        double average;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum /=arr.length;
    }


}

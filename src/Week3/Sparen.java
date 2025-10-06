package Week3;

import java.util.Scanner;

public class Sparen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum, percentageAsDecimal;
        double percentage;
        System.out.print("Geef een bedrag van op een spaarrekening: ");
        sum = sc.nextDouble();
        System.out.print("Geef een percentage: ");
        percentage = sc.nextDouble();
        percentageAsDecimal = percentage / 100;
        for (int i = 0; i <= 10; i++){
            System.out.printf("Je som van %.2f is verhoogd naar %.2f\n", sum, calculateInterest(sum, percentageAsDecimal));

        }
    }

    static double calculateInterest(double sum, double percentage) {
        /*double total = 0;
        for (int i = 0; i < 10; i++) {
            total = sum + (sum * percentage);
        }*/
        return sum + (sum * percentage);
    }
}

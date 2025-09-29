package Week2;

import java.util.Scanner;

public class Verbruik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentKm, previousKm; double liters;
        System.out.print("Geef je vorige kilometerstand op: ");
        previousKm = sc.nextInt();
        System.out.print("Geef je huidige kilometerstand op: ");
        currentKm = sc.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        liters = sc.nextDouble();

        double km = getDifferenceBetweenCurrentAndPreviouskm(currentKm, previousKm);
        double consumption = getConsumption(km, liters);

        System.out.printf("Het verbruik voor %.0f km: %.2f liter/100km.", km, consumption);
    }

    static double getDifferenceBetweenCurrentAndPreviouskm(int currentKm, int previousKm) {
        return currentKm - previousKm;
    }

    static double getConsumption(double totalKm, double liters) {
        return (liters / totalKm) * 100.0;
    }
}

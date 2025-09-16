package Week1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gewicht, lengte;
        System.out.println("Dit programma gaat je BMI berekenen.");

        System.out.print("Geef je gewicht in kg: ");
        gewicht = Double.parseDouble(sc.nextLine());
        System.out.print("Geef je lengte in meter: ");
        lengte = Double.parseDouble(sc.nextLine());
        double bmi = gewicht / (lengte * lengte);

        System.out.printf("Je BMI is %.2f %n", bmi);

        sc.close();
    }
}

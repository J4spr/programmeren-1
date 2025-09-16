package Week1;

import java.util.Scanner;

public class BmiV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gewicht, lengte;
        System.out.println("Dit programma gaat je BMI berekenen.");

        System.out.print("Geef je gewicht in kg: ");
        gewicht = Double.parseDouble(sc.nextLine());
        System.out.print("Geef je lengte in meter: ");
        lengte = Double.parseDouble(sc.nextLine());
        double bmi = gewicht / (lengte * lengte);
        sc.close();

        System.out.printf("Je BMI is %.2f %n", bmi);
        if (bmi < 18)
            System.out.println("Je hebt ondergewicht");
        if (bmi >= 18 && bmi < 25)
            System.out.println("Dat is in orde");
        if (bmi >= 25 && bmi < 30)
            System.out.println("Je hebt overgewicht");
        if (bmi > 30)
            System.out.println("Je hebt obesitas");


        System.out.printf("Je BMI is %f", bmi);

    }
}

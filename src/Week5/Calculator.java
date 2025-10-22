package Week5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat wil je doen?");
        System.out.println("1 = sinus\n2 = cosinus hyperbolicus\n3 = wortel");
        int input = sc.nextInt();
        System.out.println("Geef de minimum x-waarde");
        int xValue = sc.nextInt();
        switch (input){
            case 1 -> System.out.println(calculateSinus(xValue));
            case 2 -> System.out.println(calculateCosinus(xValue));
            case 3 -> System.out.println(calculateSqrt(xValue));
            default -> System.out.println("Geef een geldig getal in.");
        }

    }

    static String calculateSinus(int x) {
        String s = new String();
        String space = " ";
        int position;
        for (int i = 0; i < x * 3; i++) {
            position = (int) (10 * Math.sin(x) + 10);
            s = String.format("%s*\n", space.repeat(position));
        }
        return s;
    }

    static String calculateCosinus(int x) {
        String s = new String();
        String space = " ";
        int position;
        for (int i = 0; i < x * 3; i++) {
            position = (int) (10 * Math.cosh(x));
            s = String.format("%s*\n", space.repeat(position));
        }
        return s;
    }

    static String calculateSqrt(int x) {
        String s = new String();
        String space = " ";
        int position;
        for (int i = 0; i < x * 3; i++) {
            position = (int) (Math.sqrt(10 * x));
            s = String.format("%s*\n", space.repeat(position));
        }
        return s;
    }
}


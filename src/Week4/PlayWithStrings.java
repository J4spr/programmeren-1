package Week4;

import java.util.Scanner;

public class PlayWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Geef een woord in:");
        s = sc.nextLine();
        System.out.printf("%s\n", s.length());
        System.out.printf("%s\n", s.toUpperCase());
        System.out.printf("%s\n", s.toLowerCase());
        System.out.printf("%s\n", s.charAt(0));
        System.out.printf("%s\n", s.charAt(s.length() - 1));
        System.out.printf("%s\n", s.replace(" ", "").length());
        System.out.printf("%s\n", s.replace("e", "_"));
        System.out.printf("%s\n", s.replace(" ", ""));
        System.out.printf("%s\n", s.replaceAll("[AEIOUaeiou]", ""));
    }
}

package Week3;


import java.util.Scanner;

public class AutocorrectVervolg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1, w2;
        System.out.print("Geef een woord: ");
        w1 = sc.nextLine().toUpperCase();
        System.out.print("Geef nog een woord: ");
        w2 = sc.nextLine().toUpperCase();

        int distance = calculateDistance(w1, w2);

        System.out.printf("De afstand tussen \"%s\" en \"%s\" is %d", w1.toLowerCase(), w2.toLowerCase(), distance);

    }

    static int calculateDistance(String w1, String w2) {
        int len1 = w1.length();
        int len2 = w2.length();

        int shortest = Math.min(len1, len2);
        int longest = Math.max(len1, len2);

        int distance = 0;
        for (int i = 0; i < shortest; i++) {
            distance += Math.abs(w1.charAt(i) - w2.charAt(i));
        }

        if (len1 > len2) {
            for (int i = shortest; i < len1; i++) {
                distance += w2.charAt(i);
            }
        } else {
            for (int i = shortest; i < len2; i++) {
                distance += w2.charAt(i);
            }
        }
        return distance;
    }


}

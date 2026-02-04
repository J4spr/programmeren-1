package Week7;

import java.util.Scanner;

public class Woordlengtes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Hoeveel woorden wil je ingeven? ");
        int wordCount = sc.nextInt();
        sc.nextLine();
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            System.out.print("Geef een woord in: ");
            s = sc.nextLine();
            words[i] = s;

        }

        System.out.printf("Het langste woord is: %s\n", findLongestWord(words));
        System.out.printf("Het kortste woord is: %s\n", findShortestWord(words));

    }

    static String findShortestWord(String[] words) {
        String s = findLongestWord(words);
        for (String word : words) {
            if (s.length() > word.length()) {
                s = word;
            }
        }
        return s;
    }

    static String findLongestWord(String[] words) {
        String s = "";
        for (String word : words) {
            if (s.length() < word.length()) {
                s = word;
            }
        }
        return s;
    }
}

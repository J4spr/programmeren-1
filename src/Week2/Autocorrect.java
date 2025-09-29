package Week2;

import java.util.Scanner;

public class Autocorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een woord:");
        String word1 = sc.nextLine().toUpperCase();
        System.out.print("Geef nog een woord: ");
        String word2 = sc.nextLine().toUpperCase();
        String[] word1Array = createArray(word1);
        String[] word2Array = createArray(word2);
        if (word1.length() < word2.length())
            calculateDistance(word1Array, word2Array);
        if (word2.length() < word1.length())
            calculateDistance(word2Array, word1Array);
    }

    static String[] createArray(String s) {
        String[] sArray = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sArray[i] = String.valueOf(s.charAt(i));
        }
        return sArray;
    }

    static String calculateDistance(String[] s1, String[] s2) {

        return "test";
    }

    static char[] getCodePoints(String s) {
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String hex = String.format("%04x", (int) ch);
            int hexToInt = Integer.parseInt(hex, 16);
            char intToChar = (char) hexToInt;
            array[i] = intToChar;
        }
        return array;
    }
}

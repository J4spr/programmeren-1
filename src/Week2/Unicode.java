package Week2;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een string in: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length();i++) {
            System.out.printf("%s Heeft een codepoint gelijk aan %d\n", s.charAt(i), getUnicode(s.charAt(i)));
        }

    }
    static int getUnicode(char letter) {
        String hex = String.format("%04x", (int) letter);
        int hexToInt = Integer.parseInt(hex,16);
        char intToChar = (char) hexToInt;
        return intToChar;
    }
}

package Week3;

import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("geef een woord:");
        word = sc.nextLine();
        String wordbuilder= "";
        StringBuilder morse = new StringBuilder();

        for (char c : word.toCharArray()) {
            morse.append(toMorse(c)).append(" ");
        }
        System.out.println(morse.toString().trim());

    }
    public static String toMorse(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a' -> { return ".-"; }
            case 'b' -> { return "-..."; }
            case 'c' -> { return "-.-."; }
            case 'd' -> { return "-.."; }
            case 'e' -> { return "."; }
            case 'f' -> { return "..-."; }
            case 'g' -> { return "--."; }
            case 'h' -> { return "...."; }
            case 'i' -> { return ".."; }
            case 'j' -> { return ".---"; }
            case 'k' -> { return "-.-"; }
            case 'l' -> { return ".-.."; }
            case 'm' -> { return "--"; }
            case 'n' -> { return "-."; }
            case 'o' -> { return "---"; }
            case 'p' -> { return ".--."; }
            case 'q' -> { return "--.-"; }
            case 'r' -> { return ".-."; }
            case 's' -> { return "..."; }
            case 't' -> { return "-"; }
            case 'u' -> { return "..-"; }
            case 'v' -> { return "...-"; }
            case 'w' -> { return ".--"; }
            case 'x' -> { return "-..-"; }
            case 'y' -> { return "-.--"; }
            case 'z' -> { return "--.."; }
            case '0' -> { return "-----"; }
            case '1' -> { return ".----"; }
            case '2' -> { return "..---"; }
            case '3' -> { return "...--"; }
            case '4' -> { return "....-"; }
            case '5' -> { return "....."; }
            case '6' -> { return "-...."; }
            case '7' -> { return "--..."; }
            case '8' -> { return "---.."; }
            case '9' -> { return "----."; }
            default -> { return "?"; }  // unknown character
        }
}
}
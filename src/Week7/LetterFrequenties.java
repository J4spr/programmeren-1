package Week7;

import java.util.Scanner;

public class LetterFrequenties {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CharacterFrequencies frequencies = new CharacterFrequencies();

        String sentence;
        do {
            System.out.print("Geef een zin: ");
            sentence = keyboard.nextLine().toUpperCase();
            System.out.printf("%s\n", sentence);
            frequencies.adaptFrequencies(sentence);
            System.out.println(frequencies.printFrequencies());
        } while (!sentence.isEmpty());
    }
}

class CharacterFrequencies {
    private final int LENGTH_ALFABET_ARRAY = 26;
    private final char[] ALFABET = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private final int ROW_LENGHT = 6;
    private int[] frequency = new int[LENGTH_ALFABET_ARRAY];



    public void adaptFrequencies(String sentence) {
        sentence = sentence.toLowerCase();
        for (int i = 0 ; i < LENGTH_ALFABET_ARRAY;i++){
            for (int j = 0; j < sentence.length();j++){
                if (ALFABET[i] == sentence.charAt(j)){
                    frequency[i]++;
                }
            }
        }
    }

    public StringBuilder printFrequencies() {
        StringBuilder sb = new StringBuilder();
        int currentPosition = 0;

        for (int i = 0; i < LENGTH_ALFABET_ARRAY; i++){
            if (currentPosition < ROW_LENGHT){
                sb.append(ALFABET[i]).append(" --> ").append(frequency[i]).append("x ");
                currentPosition++;
            } else {
                sb.append("\n");
                currentPosition = 0;
            }
        }
        return sb;

    }
}

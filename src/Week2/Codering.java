package Week2;

import java.util.Scanner;

public class Codering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.print("Geef een bericht dat ik moet encoderen: ");
        message = sc.nextLine().toUpperCase();
        String encodedmessage = encode(message);
        System.out.printf("Hier is je geëencodeerde bericht: %s\n", encodedmessage);
        System.out.printf("En hier is je gedecodeerde bericht: %s\n", decode(encodedmessage).toLowerCase());
    }

    //  A function that takes a string and encodes it using the ascii table
    static String encode(String message) {
//      Declare the encoded message as an empty string
        String encodedMessage = "";
//      Declare the individual encoded characters
        int messageToIntsWithAddedValues, messageToInts;
//      loop over the string
        for (int i = 0; i < message.length(); i++) {
//      call the function to convert the message to integers so we can do math on them
            messageToInts = convertToIntegers(message.charAt(i));
//      store the encoded message as integers in this variable
            messageToIntsWithAddedValues = messageToInts + 3;
//      convert the encoded message that is currently stored as integers back to a character
//      and append it at the end of the string
            encodedMessage += convertToChar(messageToIntsWithAddedValues);
        }
//      return the encoded message
        return encodedMessage;
    }

    static String decode(String message) {
        String decodedMessage = "";
        char decodedChars;
        int messageWithSubstractedValues, messageToInts;
        for (int i = 0; i < message.length(); i++) {
            messageToInts = convertToIntegers(message.charAt(i));
            messageWithSubstractedValues = messageToInts - 3;
            decodedMessage += convertToChar(messageWithSubstractedValues);
        }
        return decodedMessage;
    }

    static int convertToIntegers(char letter) {
        int asciiChar = letter;
        return asciiChar;
    }

    static char convertToChar(int letter) {
        return (char) letter;
    }


}

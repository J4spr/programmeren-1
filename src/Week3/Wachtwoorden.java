package Week3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wachtwoorden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        System.out.print("Geef een wachtwoord in: ");
        password = sc.nextLine();
        System.out.printf("%s", isCorrect(password));

    }

    static String isCorrect(String message) {
        String returnString = "";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#?/_-]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(message);
        if (message.length() < 8) {
            returnString = "Je wachtwoord moet minstens 8 karakters lang zijn ";
        }
        if (!(m.matches()))
            returnString = "Je paswoord moet minstens een hoofdletter, speciaal karakter, een nummer en een kleine letter hebben";
        if (m.matches())
            returnString = "Je paswoord is goedgekeurd";


        return returnString;
    }
}

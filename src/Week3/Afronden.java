package Week3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Afronden {
    public static void main(String[] args) {

        // Eerste manier: afronden met Math.round
        // Math.round rondt altijd af naar een geheel getal.
        // Door eerst te vermenigvuldigen (10, 100, 1000, ...) en daarna weer te delen,
        // kan je toch afronden op een bepaald aantal decimalen.
        System.out.println("Eerste manier om af te ronden:");
        double getal = 10.123456;
        System.out.println(getal);
        getal = getal * 100; // vermenigvuldig met 100 om naar 2 decimalen te gaan
        System.out.println(getal);
        double afgerondGetal = Math.round(getal); // rond af naar een geheel getal
        System.out.println(afgerondGetal);
        afgerondGetal = afgerondGetal / 100; // deel terug door 100 → 2 decimalen
        System.out.println(afgerondGetal);

        // Tweede manier: afronden met BigDecimal
        // BigDecimal is een klasse uit de standaard Java API (java.math).
        // Je hoeft die niet zelf te schrijven: hij bestaat al en is gemaakt
        // om nauwkeurig met getallen te rekenen (vooral bij geldbedragen).
        // Met setScale(n, RoundingMode) kan je direct afronden op 'n' decimalen
        // volgens een bepaalde afrondingsregel, bv. HALF_UP.
        System.out.println("\nTweede manier om af te ronden:");
        BigDecimal cijfer = new BigDecimal("10.123456");
        System.out.println(cijfer);
        BigDecimal afgerondCijfer = cijfer.setScale(2, RoundingMode.HALF_UP); // afronden op 2 decimalen
        System.out.println(afgerondCijfer);

        // Tip: je kan deze code ook korter schrijven in één regel:
        // System.out.println(BigDecimal.valueOf(10.123456).setScale(2, RoundingMode.HALF_UP));

        // Derde manier: afronden en formatteren met DecimalFormat
        // DecimalFormat wordt gebruikt om een getal netjes weer te geven.
        // Het verandert de waarde zelf niet, enkel de weergave.
        System.out.println("\nDerde manier om af te ronden (DecimalFormat):");
        DecimalFormat df = new DecimalFormat("#.##"); // maximaal 2 decimalen
        String geformatteerd = df.format(10.123456);
        System.out.println(geformatteerd);
    }
}
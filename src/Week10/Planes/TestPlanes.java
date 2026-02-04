package Week10.Planes;

import java.util.ArrayList;
import java.util.List;

public class TestPlanes {
    public static void main(String[] args) {
        Plane v1 = new Plane(new PlaneType("A345", "Airbus A340-541"), "A6-EHD", "Etihad Airways");
        Plane v2 = new Plane(new PlaneType("B739", "Boeing 737-9K2"), "PH-BXR", "KLM");
        Plane v3 = new Plane(new PlaneType("B748", "Boeing 747-830"), "D-ABYQ", "Lufthansa");
        Plane v4 = new Plane(new PlaneType("A333", "Airbus A330-323X"), "N820NW", "Delta Air Lines");
        Plane v5 = new Plane(new PlaneType("A333", "Airbus A330-343X"), "C-GFAJ", "Air Canada");

        // 1.
        // Maak een variabele aan van het type List<Plane> en initialiseer deze variabele
        // met een nieuw lijst object; gebruik hiervoor klasse ArrayList.
        List<Plane> planeList = new ArrayList<>();

        // 2.
        // Voeg de vijf vliegtuigen toe aan je lijst.
        planeList.set(0, v1);
        planeList.set(1, v2);
        planeList.set(2, v3);
        planeList.set(3, v4);
        planeList.set(4, v5);
        // 3.
        // Gebruik een for-each lus om elk element uit je lijst af te drukken op het scherm.
        for (Plane i : planeList) {
            System.out.println(i);
        }
        System.out.println(); // lege lijn...

        // 4.
        // Gebruik een iterator om je lijst te overlopen. Als je een vliegtuig van KLM
        // tegenkomt, verwijder dit dan met behulp van de iterator.

        // 5.
        // Gebruik een for-each lus om elk element uit je lijst af te drukken op het scherm.
    }
}

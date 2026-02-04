package Week9.Werknemers;

public class TestEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new HourlyWorker("Jos", 57082332149L, 38),
                new HourlyWorker("Yousri", 61030350468L, 40),
                new SalariedEmployee("Sanae", 54110774131L, 1.6)
        };

        for (Employee i : employees){
            System.out.println(i);
        }
    }
}
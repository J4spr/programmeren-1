package Week5;

public class Bank {
    public static void main(String[] args) {
        BankAccount greg = new BankAccount("Gregory Farouk", "BE15 6474 3001 5840");
        System.out.println(greg);
        greg.deposit(-2000);
        greg.deposit(3000);
        System.out.println(greg);
        if (greg.withdraw(2000)) {   // opname geeft true terug
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }
        greg.withdraw(-5000);
        if (greg.withdraw(1500)) {   // opname geeft false terug
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }

        BankAccount djordin = new BankAccount("Djordin Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + djordin);
        djordin.deposit(6487);
        System.out.println("Saldo van " + djordin.getHolder() + " = " + djordin.getBalance());
    }
}

class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder, String iban, double balance) {
        this.holder = holder;
        this.balance = balance;
        this.iban = iban;
    }

    public BankAccount(String holder, String iban) {
        BankAccount bankAccount = new BankAccount(holder, iban, 0);
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (!(this.balance <= amount))
            this.balance -= amount;
        return true;

    }

    public double getBalance() {
        return this.balance;
    }

    public String getHolder() {
        return this.holder;
    }

}
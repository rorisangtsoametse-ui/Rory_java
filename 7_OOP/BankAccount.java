// Program to demonstrate encapsulation with a BankAccount class.
// Encapsulation hides the internal state of an object and requires all interaction
// to be performed through an object's methods.

public class BankAccount {
    // private fields - not accessible from outside this class
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // public getter for balance
    public double getBalance() {
        return balance;
    }

    // public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 500.00);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(150.00);
        account.withdraw(75.00);

        System.out.println("Final balance: " + account.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to SmartBank System ===");

        // 1. Create an Object (This calls the Constructor)
        // Syntax: ClassName objectName = new ClassName(params);
        Account myAccount = new Account(101, "CodeSoldier", 5000.0);

        // 2. Test the methods
        myAccount.checkBalance(); // Should show 5000.0

        System.out.println("\n--- Testing Deposit ---");
        myAccount.deposit(1500.0); // Balance becomes 6500.0

        System.out.println("\n--- Testing Withdrawal ---");
        myAccount.withdraw(2000.0); // Balance becomes 4500.0

        System.out.println("\n--- Testing Invalid Withdrawal ---");
        myAccount.withdraw(10000.0); // Should show Error

        System.out.println("\n--- Final Status ---");
        myAccount.checkBalance();
    }
}


// The Blueprint for a Bank Account
class Account {
    // Encapsulation: Making variables private so no one can mess with them directly
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor: To initialize the object when we use 'new'
    public Account(int accNum, String name, double initialBalance) {
        this.accountNumber = accNum;
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    // Method to Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // Add to existing balance
            System.out.println("Success! " + amount + " deposited.");
            System.out.println("New Balance: " + this.balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    
    // Method to Withdraw Money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Success! " + amount + " withdrawn.");
            System.out.println("Remaining Balance: " + this.balance);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    // Getter to just SEE the balance
    public void checkBalance() {
        System.out.println("--- Account Details ---");
        System.out.println("Account ID: " + this.accountNumber); // <--- Added this line
        System.out.println("Holder: " + this.accountHolder);
        System.out.println("Current Balance: " + this.balance);
    }
}



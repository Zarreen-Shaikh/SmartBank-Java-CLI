// The Blueprint for a Bank Account
class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accNum, String name, double initialBalance) {
        this.accountNumber = accNum;
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Success! " + amount + " deposited.");
            System.out.println("New Balance: " + this.balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Success! ₹" + amount + " withdrawn.");
            System.out.println("Remaining Balance: ₹" + this.balance);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("--- Account Details ---");
        System.out.println("Account ID: " + this.accountNumber);
        System.out.println("Holder: " + this.accountHolder);
        System.out.println("Current Balance: " + this.balance);
    }

    // This is the Getter we added today!
    public int getAccountNumber() {
        return this.accountNumber;
    }
}

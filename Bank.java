import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }
    public void addCustomer(int accNum, String name, double amount) {
        Account newAcc = new Account(accNum, name, amount);
        this.accounts.add(newAcc);
        System.out.println("Success! Account created for " + name);
    }

    public Account findAccount(int accNum) {
        for (Account acc : this.accounts) {
            if (acc.getAccountNumber() == accNum) {
                return acc;
            }
        }
        System.out.println("Error: Account number " + accNum + " not found.");
        return null;
    }
}
    



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("=== Welcome to SmartBank System ===");

        while (isRunning) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next(); // simple next() handles one word names well
                    System.out.print("Enter Initial Deposit: ");
                    double amount = sc.nextDouble();
                    sbi.addCustomer(id, name, amount);
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    int depId = sc.nextInt();
                    Account depAcc = sbi.findAccount(depId);
                    if (depAcc != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        double depAmount = sc.nextDouble();
                        depAcc.deposit(depAmount);
                    }
                    break;
                
                case 3: 
                    // Challenge: Try to write the Withdraw logic yourself here!
                    // It is almost same as Case 2.
                    System.out.print("Enter Account ID: ");
                    int withId = sc.nextInt();
                    Account withAcc = sbi.findAccount(withId);
                    if (withAcc != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double withAmount = sc.nextDouble();
                        withAcc.withdraw(withAmount);
                    }
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    int balId = sc.nextInt();
                    Account balAcc = sbi.findAccount(balId);
                    if (balAcc != null) {
                        balAcc.checkBalance();
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using SmartBank. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Choice. Try again.");
            }
        }
        sc.close();
    }
}

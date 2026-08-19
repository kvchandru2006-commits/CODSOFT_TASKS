import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    // Display ATM menu
    public void displayMenu() {

        System.out.println("\n==============================");
        System.out.println("         ATM MACHINE");
        System.out.println("==============================");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("==============================");
    }

    // Check balance
    public void checkBalance() {

        System.out.printf("Current Balance: ₹%.2f\n",
                account.getBalance());
    }

    // Deposit money
    public void deposit() {

        System.out.print("Enter deposit amount: ₹");
        double amount = sc.nextDouble();

        if (account.deposit(amount)) {
            System.out.printf(
                "Deposit successful!\nAmount Deposited: ₹%.2f\n",
                amount
            );

            System.out.printf(
                "New Balance: ₹%.2f\n",
                account.getBalance()
            );

        } else {
            System.out.println(
                "Invalid deposit amount!"
            );
        }
    }

    // Withdraw money
    public void withdraw() {

        System.out.print("Enter withdrawal amount: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {

            System.out.println(
                "Invalid withdrawal amount!"
            );

        } else if (amount > account.getBalance()) {

            System.out.println(
                "Insufficient balance!"
            );

        } else {

            account.withdraw(amount);

            System.out.printf(
                "Withdrawal successful!\nAmount Withdrawn: ₹%.2f\n",
                amount
            );

            System.out.printf(
                "Remaining Balance: ₹%.2f\n",
                account.getBalance()
            );
        }
    }

    // Start ATM
    public void start() {

        int choice;

        do {

            displayMenu();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println(
                        "\nThank you for using the ATM!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please try again."
                    );
            }

        } while (choice != 4);

        sc.close();
    }

    // Main method
    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        atm.start();
    }
}
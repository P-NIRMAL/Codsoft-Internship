import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 500.0;
        int choice = 0;

        System.out.println("Welcome to ATM");

        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                continue;
            }

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: " + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                if (!input.hasNextDouble()) {
                    System.out.println("Invalid amount.");
                    input.next();
                    continue;
                }
                double deposit = input.nextDouble();
                if (deposit <= 0) {
                    System.out.println("Amount must be more than 0.");
                } else {
                    balance += deposit;
                    System.out.println("Amount deposited.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                if (!input.hasNextDouble()) {
                    System.out.println("Invalid amount.");
                    input.next();
                    continue;
                }
                double withdraw = input.nextDouble();
                if (withdraw <= 0) {
                    System.out.println("Amount must be more than 0.");
                } else if (withdraw > balance) {
                    System.out.println("Not enough balance.");
                } else {
                    balance -= withdraw;
                    System.out.println("Amount withdrawn.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}

import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount deposited successfully.");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Amount withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("\n----- Account Details -----");
                    System.out.println("Account Holder : " + name);
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Balance        : ₹" + balance);
                    break;

                case 5:
                    System.out.println("Thank you for using Bank Account System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

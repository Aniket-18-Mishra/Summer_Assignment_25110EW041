import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] products = {
                "Laptop",
                "Mouse",
                "Keyboard",
                "Monitor",
                "Printer"
        };

        int[] quantity = {
                10, 25, 15, 8, 5
        };

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Add Stock");
            System.out.println("3. Sell Product");
            System.out.println("4. Check Product Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n----- Inventory -----");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i] +
                                " - Quantity: " + quantity[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter product number: ");
                    int add = sc.nextInt();

                    if (add >= 1 && add <= products.length) {
                        System.out.print("Enter quantity to add: ");
                        int q = sc.nextInt();

                        quantity[add - 1] += q;
                        System.out.println("Stock updated successfully.");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product number: ");
                    int sell = sc.nextInt();

                    if (sell >= 1 && sell <= products.length) {
                        System.out.print("Enter quantity to sell: ");
                        int q = sc.nextInt();

                        if (q <= quantity[sell - 1]) {
                            quantity[sell - 1] -= q;
                            System.out.println("Product sold successfully.");
                        } else {
                            System.out.println("Insufficient stock.");
                        }
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter product number: ");
                    int check = sc.nextInt();

                    if (check >= 1 && check <= products.length) {
                        System.out.println("Product: " + products[check - 1]);
                        System.out.println("Available Quantity: " + quantity[check - 1]);
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

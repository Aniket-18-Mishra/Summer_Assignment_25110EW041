import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] numbers = new String[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    if (count < names.length) {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Mobile Number: ");
                        numbers[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact added successfully.");
                    } else {
                        System.out.println("Contact list is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("\n----- Contact List -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + names[i] + " - " + numbers[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Name   : " + names[i]);
                            System.out.println("Mobile : " + numbers[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

import java.util.Scanner;

public class Q117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        int[] rolls = new int[10];
        double[] marks = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < names.length) {
                        sc.nextLine(); // Consume newline

                        System.out.print("Enter Student Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rolls[count] = sc.nextInt();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();

                        count++;
                        System.out.println("Student record added successfully.");
                    } else {
                        System.out.println("Record limit reached.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records available.");
                    } else {
                        System.out.println("\n----- Student Records -----");
                        System.out.printf("%-5s %-20s %-10s %-10s%n",
                                "No.", "Name", "Roll", "Marks");

                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-5d %-20s %-10d %-10.2f%n",
                                    (i + 1), names[i], rolls[i], marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rolls[i] == searchRoll) {
                            System.out.println("\nStudent Found:");
                            System.out.println("Name  : " + names[i]);
                            System.out.println("Roll  : " + rolls[i]);
                            System.out.println("Marks : " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

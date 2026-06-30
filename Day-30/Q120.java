import java.util.Scanner;

public class Q120 {

    static Scanner sc = new Scanner(System.in);

    static String[] names = new String[10];
    static int[] rolls = new int[10];
    static double[] marks = new double[10];
    static int count = 0;

    public static void addStudent() {
        if (count == names.length) {
            System.out.println("Record is full.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rolls[count] = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student added successfully.");
    }

    public static void viewStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < count; i++) {
            System.out.println("Name : " + names[i]);
            System.out.println("Roll : " + rolls[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("-------------------------");
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rolls[i] == roll) {
                System.out.println("Student Found");
                System.out.println("Name : " + names[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void updateMarks() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rolls[i] == roll) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextDouble();
                System.out.println("Marks updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rolls[i] == roll) {

                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    rolls[j] = rolls[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;
                System.out.println("Student record deleted.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}

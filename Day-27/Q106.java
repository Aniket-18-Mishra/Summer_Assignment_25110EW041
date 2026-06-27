import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String name = "";
        String department = "";
        double salary = 0;

        int choice;

        do {
            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();
                    break;

                case 2:
                    System.out.println("\nEmployee Details");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    break;

                case 3:
                    System.out.print("Enter New Salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Salary Updated Successfully");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
        sc.close();
    }
}
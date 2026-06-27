import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String name = "";
        double basic = 0;
        double bonus = 0;
        double deduction = 0;

        int choice;

        do {
            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Display Details");
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

                    System.out.print("Enter Basic Salary: ");
                    basic = sc.nextDouble();

                    System.out.print("Enter Bonus: ");
                    bonus = sc.nextDouble();

                    System.out.print("Enter Deduction: ");
                    deduction = sc.nextDouble();
                    break;

                case 2:
                    double netSalary = basic + bonus - deduction;
                    System.out.println("Net Salary = " + netSalary);
                    break;

                case 3:
                    System.out.println("\nEmployee Details");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Basic Salary: " + basic);
                    System.out.println("Bonus: " + bonus);
                    System.out.println("Deduction: " + deduction);
                    System.out.println("Net Salary: " + (basic + bonus - deduction));
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
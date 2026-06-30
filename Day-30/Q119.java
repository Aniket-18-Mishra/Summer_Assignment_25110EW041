import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[10];
        String[] empName = new String[10];
        double[] empSalary = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < empId.length) {
                        sc.nextLine(); // Consume newline

                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Employee Salary: ");
                        empSalary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee record limit reached.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\n----- Employee Records -----");
                        System.out.printf("%-5s %-10s %-20s %-10s%n",
                                "No.", "ID", "Name", "Salary");

                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-5d %-10d %-20s %-10.2f%n",
                                    (i + 1), empId[i], empName[i], empSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("ID     : " + empId[i]);
                            System.out.println("Name   : " + empName[i]);
                            System.out.println("Salary : " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId) {
                            System.out.print("Enter New Salary: ");
                            empSalary[i] = sc.nextDouble();
                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Mini Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

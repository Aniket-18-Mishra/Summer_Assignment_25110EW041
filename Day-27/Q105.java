import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int roll = 0;
        double marks = 0;

        int choice;

        do {
            System.out.println("\n----- Student Record Management -----");
            System.out.println("1. Add Student Record");
            System.out.println("2. View Student Record");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    roll = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    marks = sc.nextDouble();
                    break;

                case 2:
                    System.out.println("\nStudent Details");
                    System.out.println("Name: " + name);
                    System.out.println("Roll Number: " + roll);
                    System.out.println("Marks: " + marks);
                    break;

                case 3:
                    System.out.print("Enter New Marks: ");
                    marks = sc.nextDouble();
                    System.out.println("Marks Updated Successfully");
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
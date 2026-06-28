import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10]; // false = Available, true = Booked

        int choice;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < seats.length; i++) {
                        System.out.print("Seat " + (i + 1) + " : ");
                        if (seats[i]) {
                            System.out.println("Booked");
                        } else {
                            System.out.println("Available");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    int book = sc.nextInt();

                    if (book >= 1 && book <= 10) {
                        if (!seats[book - 1]) {
                            seats[book - 1] = true;
                            System.out.println("Ticket booked successfully.");
                        } else {
                            System.out.println("Seat is already booked.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel (1-10): ");
                    int cancel = sc.nextInt();

                    if (cancel >= 1 && cancel <= 10) {
                        if (seats[cancel - 1]) {
                            seats[cancel - 1] = false;
                            System.out.println("Ticket cancelled successfully.");
                        } else {
                            System.out.println("Seat is already available.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
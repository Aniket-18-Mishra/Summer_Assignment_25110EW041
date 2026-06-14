import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        double average = sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
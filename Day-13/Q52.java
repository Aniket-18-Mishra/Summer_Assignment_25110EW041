import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even elements count: " + evenCount);
        System.out.println("Odd elements count: " + oddCount);

        scanner.close();
    }
}
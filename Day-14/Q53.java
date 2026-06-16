import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 25, 33, 47, 50, 68, 72, 89};

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int result = findElement(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
        scanner.close();
    }

    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

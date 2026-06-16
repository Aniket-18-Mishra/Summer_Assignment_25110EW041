import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 25, 10, 47, 10, 68, 72, 25};

        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();

        int count = countFrequency(array, target);

        System.out.println("The number " + target + " appears " + count + " times.");
        scanner.close();
    }

    public static int countFrequency(int[] arr, int target) {
        int frequency = 0;
        for (int value : arr) {
            if (value == target) {
                frequency++;
            }
        }
        return frequency;
    }
}
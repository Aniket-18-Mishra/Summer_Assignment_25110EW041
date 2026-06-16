import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {12, 35, 1, 10, 34, 1};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) {
                second = array[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + second);
        }
        scanner.close();
    }
}
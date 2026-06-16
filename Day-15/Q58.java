import java.util.Arrays;

public class Q58 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotations = 2;

        System.out.println("Original array: " + Arrays.toString(array));

        rotateLeft(array, rotations);

        System.out.println("Array after " + rotations + " left rotations: " + Arrays.toString(array));
    }

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }
}
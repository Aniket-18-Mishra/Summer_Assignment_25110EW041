import java.util.Arrays;

public class Q59 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotations = 2;

        System.out.println("Original array: " + Arrays.toString(array));

        rotateRight(array, rotations);

        System.out.println("Array after " + rotations + " right rotations: " + Arrays.toString(array));
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
}

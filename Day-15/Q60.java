import java.util.Arrays;

public class Q60 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};

        System.out.println("Original array: " + Arrays.toString(array));

        moveZeroes(array);

        System.out.println("Array after moving zeroes: " + Arrays.toString(array));
    }

    public static void moveZeroes(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }
}



public class Q64 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        
        int n = removeDuplicates(array);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        
        return j;
    }
}
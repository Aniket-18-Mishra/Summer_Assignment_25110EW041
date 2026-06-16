import java.util.HashSet;

public class Q63 {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15, 3, 6};
        int targetSum = 9;

        findPairs(array, targetSum);
    }

    public static void findPairs(int[] arr, int sum) {
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = sum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
            }
            seen.add(num);
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
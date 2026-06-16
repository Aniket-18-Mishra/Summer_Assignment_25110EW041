import java.util.HashMap;
import java.util.Map;

public class Q62 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1, 4, 1, 3, 3, 3};

        int maxElement = array[0];
        int maxCount = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                maxElement = num;
            }
        }

        System.out.println("The element with the maximum frequency is: " + maxElement);
        System.out.println("It appears " + maxCount + " times.");
    }
}
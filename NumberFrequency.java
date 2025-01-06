
import java.util.HashMap;

public class NumberFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        findFrequency(arr);
    }
    public static void findFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count number frequencies
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the number frequencies
        for (int num : frequencyMap.keySet()) {
            System.out.println("Number " + num + " appears " + frequencyMap.get(num) + " times.");
        }
        
    }
}

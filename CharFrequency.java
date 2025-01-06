import java.util.HashMap;

public class CharFrequency {
    public static void findFrequency(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and count character frequencies
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print the character frequencies
        for (char ch : frequencyMap.keySet()) {
            System.out.println("Character '" + ch + "' appears " + frequencyMap.get(ch) + " times.");
        }
    }

    public static void main(String[] args) {
        String str = "hello world";
        findFrequency(str);
    }
}


import java.util.HashSet;

public class FirstDuplicateChar {
    
    public static void main(String[] args) {
        String str = "programming";
        char result = findFirstDuplicate(str);

        if (result != '\0') {
            System.out.println("First duplicate character: " + result);
        } else {
            System.out.println("No duplicate character found");
        }
    }
    public static char findFirstDuplicate(String str) {
        HashSet<Character> seen = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;  // Return the first duplicate character
            }
            seen.add(ch);
        }
        return '\0';  // Return null character if no duplicate found
    }
}

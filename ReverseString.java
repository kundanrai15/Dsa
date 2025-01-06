
public class ReverseString {
    public static String reverse(String str) {
        int length = str.length();
        String reversed = "";
        
        int i = length - 1;
        while (i >= 0) {
            reversed += str.charAt(i);
            i--;
        }

        return reversed;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + result);
    }
}


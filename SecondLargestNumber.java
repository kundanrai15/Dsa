
public class SecondLargestNumber {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update second largest if it's smaller than largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargest(arr);
        System.out.println("Second largest number: " + result);
    }
}


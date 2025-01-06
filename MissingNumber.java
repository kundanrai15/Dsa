
public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;
        
        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};  // Missing number is 5
        int n = 8;  // The array should contain numbers from 1 to 8
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}


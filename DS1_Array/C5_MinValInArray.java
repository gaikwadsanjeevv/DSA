package DSA.DS1_Array;
//Challenge: Find Minimum Value in an Array
//You are given an array of integers. Write a function to find and return the minimum value in the
public class C5_MinValInArray {
    public static void main(String args[]) {
        int[] arr = {3, 5, 1, 4, 2};
        int minValue = findMinValue(arr);
        System.out.println("Minimum value in the array: " + minValue);
    }

    public static int findMinValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minValue = arr[0]; // Assume the first element is the minimum

        // Loop through the array to find the minimum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i]; // Update minValue if a smaller element is found
            }
        }

        return minValue; // Return the minimum value found
    }
}

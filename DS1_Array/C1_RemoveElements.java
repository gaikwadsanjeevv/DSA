package DSA.DS1_Array;
// Challenge:  Remove Even Integers from an Array

public class C1_RemoveElements {
    public static void main(String args[]) {
        int[] myArray = {10, 15, 20, 25, 30, 35, 40};
        int n = myArray.length;

        // Count odd numbers
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (myArray[i] % 2 != 0) {
                countOdd++;
            }
        }

        // Create a new array to hold odd numbers
        int[] oddArray = new int[countOdd];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (myArray[i] % 2 != 0) {
                oddArray[index++] = myArray[i];
            }
        }

        // Print the new array with odd numbers
        System.out.println("Array after removing even integers:");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
    
}

/* Alogrithm:
 1. Initialize the original array and determine its length.
2. Count the number of odd integers in the original array.
3. Create a new array to hold the odd integers based on the count from step 2.
4. Iterate through the original array again, adding odd integers to the new array.
5. Print the new array containing only odd integers.
*/ 

/*
 * Time Complexity: O(n) - We traverse the array twice, once to count odd numbers and once to populate the new array.
 * Space Complexity: O(k) - We create a new array to hold the odd numbers, where k is the number of odd integers.
 */


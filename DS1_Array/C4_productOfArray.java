package DSA.DS1_Array;
/*
 * Challenge: Product of Array Except self
 * You’re given an integer array, nums. Return a resultant array product so that product[i] is equal to the product of all the elements of nums except nums[i].

Write an algorithm that runs in O(n)time without using the division operation.

 */
public class C4_productOfArray {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate left products
        result[0] = 1; // First element has no left elements
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate right products and multiply with left products
        int rightProduct = 1; // Initialize right product
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply with the right product
            rightProduct *= nums[i]; // Update the right product
        }

        return result;
    }
    
}
/*
 * Complexity Analysis:
 * Time Complexity: O(n) - We traverse the array a constant number of times.
 * Space Complexity: O(1) - We use the output array for storage, which does not count towards extra space.
 */
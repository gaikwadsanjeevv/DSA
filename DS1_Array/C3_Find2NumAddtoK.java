package DSA.DS1_Array;

public class C3_Find2NumAddtoK {
    public static void main(String args[]) {
        int[] arr = {10, 15, 3, 7};
        int k = 17;
        boolean result = findPairWithSum(arr, k);
        if (result) {
            System.out.println("Pair found that adds up to " + k);
        } else {
            System.out.println("No pair found that adds up to " + k);
        }
    }

    public static boolean findPairWithSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
 * Output: Pair found that adds up to 17    
 */

 /*
  * Algorithm:
  * 1. Loop through each element in the array using index i.
  * 2. For each element at index i, loop through the remaining elements in the
  * array using index j (starting from i + 1).  
  */

  /*
   * Complexity Analysis:
   * Time Complexity: O(n^2) - We have a nested loop where for each element, we check
   * all other elements.
   * Space Complexity: O(1) - We are using a constant amount of space.
   */
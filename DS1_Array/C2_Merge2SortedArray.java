// Challenge: Merge two sorted arrays into a single sorted array
package DSA.DS1_Array;  
// The class belongs to the package 'DSA.DS1_Array' – helps organize related files.

import java.util.ArrayList;
import java.util.Arrays;
// Importing ArrayList (dynamic array class) and Arrays (utility class for creating and manipulating arrays).

public class C2_Merge2SortedArray {
    // The main class containing the merge logic and the test driver (main method).

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // A static method that takes two sorted ArrayLists (nums1 and nums2)
        // and merges nums2 into nums1 so that nums1 remains sorted.

        // Pointers for nums1 and nums2 arrays  
        int p1 = 0; // p1 will traverse through nums1
        int p2 = 0; // p2 will traverse through nums2

        // Traverse both arrays until the end of nums1 or nums2 is reached
        while (p1 < nums1.size() && p2 < nums2.size()) {
            // The loop runs while both pointers are within their array bounds

            // If the current element of nums1 is greater than current element of nums2,
            // then nums2's element should come before nums1's element to maintain sorted order.
            if (nums1.get(p1) > nums2.get(p2)) {
                // Insert nums2's element into nums1 at the current p1 position
                nums1.add(p1, nums2.get(p2));

                // Move both pointers forward:
                // - p1++ because we just inserted a new element and need to move to next position.
                // - p2++ because we’ve already placed that nums2 element into nums1.
                p1++;
                p2++;
            }
            // Otherwise, nums1[p1] <= nums2[p2]
            else {
                // No insertion needed, just move p1 forward to continue comparing next elements.
                p1++;
            }
        }

        // After the loop, if nums2 still has remaining elements,
        // it means all nums1 elements are smaller, and remaining nums2 elements are larger.
        if (p2 < nums2.size()) {
            // Append all remaining nums2 elements into nums1
            // subList(p2, nums2.size()) gives the portion of nums2 not yet merged.
            nums1.addAll(nums2.subList(p2, nums2.size()));
        }

        // Return the merged sorted array (nums1)
        return nums1;
    }

    public static void main(String[] args) {
        // The main method demonstrates multiple test cases for mergeArrays().

        // Creating a list of list of integers (nums1) – each sublist is one test case input.
        ArrayList<ArrayList<Integer>> nums1 = new ArrayList<>();
        nums1.add(new ArrayList<>(Arrays.asList(23, 33, 35, 41, 44, 47, 56, 91, 105))); // sorted
        nums1.add(new ArrayList<>(Arrays.asList(1, 2)));                               // small case
        nums1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));                            // duplicates
        nums1.add(new ArrayList<>(Arrays.asList(6)));                                  // single element
        nums1.add(new ArrayList<>(Arrays.asList(12, 34, 45, 56, 67, 78, 89, 99)));     // larger case

        // Similarly, create nums2 test cases matching the above
        ArrayList<ArrayList<Integer>> nums2 = new ArrayList<>();
        nums2.add(new ArrayList<>(Arrays.asList(32, 49, 50, 51, 61, 99)));             // merge with multiple
        nums2.add(new ArrayList<>(Arrays.asList(7)));                                  // merge one
        nums2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));                         // merge into duplicates
        nums2.add(new ArrayList<>(Arrays.asList(-99, -45)));                           // merge negatives
        nums2.add(new ArrayList<>(Arrays.asList(100)));                                // merge single large number

        // Loop through each test case
        for (int i = 0; i < nums1.size(); i++) {
            // Print test case index and input arrays
            System.out.println((i + 1) + ".\tFirst array: " + nums1.get(i));
            System.out.println("\tSecond array: " + nums2.get(i));

            // Call mergeArrays() with a copy of each input array (so original stays unchanged)
            ArrayList<Integer> mergedArray = mergeArrays(new ArrayList<>(nums1.get(i)), new ArrayList<>(nums2.get(i)));

            // Print the merged sorted result
            System.out.println("\tMerged array: " + mergedArray);

            // Print a separator line for readability
            System.out.println(new String(new char[100]).replace("\0", "-"));
        }
    }
}

// Output:
// 1.	First array: [23, 33, 35, 41, 44, 47, 56, 91, 105]
// 	Second array: [32, 49, 50, 51, 61, 99]
// 	Merged array: [23, 32, 33, 35, 41, 44, 47, 49, 50, 51, 56, 61, 91, 99, 105]
// ----------------------------------------------------------------------------------------------------
// 2.	First array: [1, 2]
// 	Second array: [7]
// 	Merged array: [1, 2, 7]                                 
// ----------------------------------------------------------------------------------------------------
// 3.	First array: [1, 1, 1]
// 	Second array: [1, 2, 3, 4]
// 	Merged array: [1, 1, 1, 1, 2, 3, 4]
// ----------------------------------------------------------------------------------------------------
// 4.	First array: [6]            
// 	Second array: [-99, -45]
// 	Merged array: [-99, -45, 6]
// ----------------------------------------------------------------------------------------------------
// 5.	First array: [12, 34, 45, 56,


// 67, 78, 89, 99]
// 	Second array: [100]
// 	Merged array: [12, 34, 45, 56,

// 67, 78, 89, 99, 100]
// ----------------------------------------------------------------------------------------------------

/* Algorithm:
 1. Initialize two pointers, p1 and p2, to traverse the two input arrays.
2. Use a while loop to traverse both arrays until the end of either array is reached.
3. Inside the loop, compare the elements at the current positions of p1 and p2

    - If the element in the first array (nums1) is greater than the element in the second array (nums2), insert the element from nums2 into nums1 at position p1, and increment both p1 and p2.
    - If the element in nums1 is less than or equal to the element in nums2, simply increment p1.
4. After the loop, if there are remaining elements in nums2 (i.e., p2 is less than the size of nums2), append those elements to nums1.
5. Return the merged array (nums1).
*/

/*
 * Complexity analysis:
 * Time Complexity: O(m + n) - We traverse both arrays once, where m and n are the lengths of nums1 and nums2, respectively.
 * Space Complexity: O(1) - We are merging nums2 into nums1 in place, so no additional space is required.   
 */
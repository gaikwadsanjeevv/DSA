//Challenge:  Merge two sorted arrays into a single sorted array
package DSA.DS1_Array;
import java.util.ArrayList;
import java.util.Arrays;

public class C2_Merge2SortedArray {
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
// Pointers for nums1 and nums2 arrays  
        int p1 = 0;
        int p2 = 0;

        // Traverse both arrays until the end of nums1 or nums2 is reached
        while (p1 < nums1.size() && p2 < nums2.size()) {
            // If the value at p1 is greater than the value at p2, place the value at p2 into p1 and increment p1 and p2.
            if(nums1.get(p1) > nums2.get(p2)) {
                nums1.add(p1, nums2.get(p2));
                p1++;
                p2++;
            }
            // Otherwise, increment p1
            else {
                p1++;
            }
        }

        // Append the remaining elements of nums2 into nums1
        if (p2 < nums2.size()) {
            nums1.addAll(nums2.subList(p2, nums2.size()));
        }

        return nums1;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nums1 = new ArrayList<>();
        nums1.add(new ArrayList<>(Arrays.asList(23, 33, 35, 41, 44, 47, 56, 91, 105)));
        nums1.add(new ArrayList<>(Arrays.asList(1, 2)));
        nums1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        nums1.add(new ArrayList<>(Arrays.asList(6)));
        nums1.add(new ArrayList<>(Arrays.asList(12, 34, 45, 56, 67, 78, 89, 99)));

        ArrayList<ArrayList<Integer>> nums2 = new ArrayList<>();
        nums2.add(new ArrayList<>(Arrays.asList(32, 49, 50, 51, 61, 99)));
        nums2.add(new ArrayList<>(Arrays.asList(7)));
        nums2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        nums2.add(new ArrayList<>(Arrays.asList(-99, -45)));
        nums2.add(new ArrayList<>(Arrays.asList(100)));

        for (int i = 0; i < nums1.size(); i++) {
            System.out.println((i + 1) + ".\tFirst array: " + nums1.get(i));
            System.out.println("\tSecond array: " + nums2.get(i));

            ArrayList<Integer> mergedArray = mergeArrays(new ArrayList<>(nums1.get(i)), new ArrayList<>(nums2.get(i)));
            System.out.println("\tMerged array: " + mergedArray);
            System.out.println(new String(new char[100]).replace("\0", "-"));
        }
    }
}
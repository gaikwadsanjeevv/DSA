package DSA.DS1_Array;

public class A4_Initialization2DArray {
    public static void main(String args[]) {
        // Declaration and Initialization of 2D Array
        int[][] my2DArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a 2D array
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

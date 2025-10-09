package DSA.DS1_Array;

public class A2_AddElement {
    
     public static void main(String args[]) {
      //Declaration Syntax
      int myArray[];
    
      // Initialization Syntax
      myArray = new int [4];
    
      // Adding elements to an array
      myArray[0] = 10;
      myArray[1] = 20;
      myArray[2] = 30;
      myArray[3] = 40;
    
      // Accessing elements in an array
      for (int i = 0; i < myArray.length; i++){
        System.out.println(myArray[i]);
      } 
      myArray[0] = 100; // updating the value at index 0
      System.out.println("After updating index 0: " + myArray[0]);

    for (int i = 0; i < myArray.length; i++){
        System.out.println(myArray[i]);
      } 
     }
}
// Output: 10 20 30 40
// After updating index 0: 100  
// Array after updating 100 20 30 40


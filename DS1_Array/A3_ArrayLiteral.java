package DSA.DS1_Array;

public class A3_ArrayLiteral {
 public static void main(String args[]) {

  // Initialization, Declaration and Adding Elements in one step
  int[] myArray = {10,20,30,40};

  // Accessing elements in an array
  for (int i = 0; i < myArray.length; i++){
      System.out.println(myArray[i]);
  }   

  // Updating value of element at index 3
  myArray[3] = 900;  

  // Accessing elements in the updated array
   System.out.println("Updated Array:");
  for (int i = 0; i < myArray.length; i++){
      System.out.println(myArray[i]);
  
  } 

 }
}
// Output: 10 20 30 40
// Updated Array:
// 10 20 30 900

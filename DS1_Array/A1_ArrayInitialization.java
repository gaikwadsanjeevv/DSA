package DSA.DS1_Array;

public class A1_ArrayInitialization {
   
 public static void main(String args[]) {
  //Declaration Syntax
  int myArray[];

  // Initialization Syntax
  myArray = new int [4];

  // Accessing elements in an array
  for (int i = 0; i < myArray.length; i++){
      System.out.println(myArray[i]);
  } 

 }
}
// Output: 0 0 0 0
// Default value of int array is 0

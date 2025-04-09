## DSA  
![image](https://github.com/user-attachments/assets/1a2fb2cd-e66a-4b8c-a38e-b6f07a99f1d8)  
![image](https://github.com/user-attachments/assets/56bc17dc-ffb1-4a2b-886d-b1a733f9237a)  
![image](https://github.com/user-attachments/assets/fd244161-6bfe-4923-ac75-81a33ff2f4fb)  
![image](https://github.com/user-attachments/assets/8afa5667-d001-48d3-8d6a-61fe6555a51f)  
![image](https://github.com/user-attachments/assets/01f3130c-5895-4ed1-b8a6-1ba6b061f266)  
![image](https://github.com/user-attachments/assets/5bfdea7e-9cd7-47ca-b9e3-92789c76a986)
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> studentList1 = Arrays.asList("tim", "drake", "ashish", "shubham");
        List<String> studentList2 = Arrays.asList("andrew", "chris", "harshit", "lary", "shubham");

        checkStudent(studentList2);
    }

    public static void checkStudent(List<String> studentList) {
        for (String student : studentList) {
            if (student.equals("chris")) {
                System.out.println("Available");
            }
        }
    }
}
//“For for and while loop, it performs iterations equal to the number of elements, so even though ‘chris’ was the 2nd element, it did not stop and loop checked //till last.” because the loop does not have a break statement.
```
![image](https://github.com/user-attachments/assets/ac8854eb-4acb-4a85-be8a-a6ae31c55f5b)  
##### Big O(1)  
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> studentList = Arrays.asList("andrew", "akshat", "chris", "harshit", "lary", "shubham", "tim", "drake", "ashish");

        displayStudent(studentList);
    }

    public static void displayStudent(List<String> studentList) {
        System.out.println(studentList.get(0));  // prints "andrew"
    }
}
//Big(O) - O(1)
```
##### Counting Operations  

```java
import java.util.*; // O(1)

public class Main {
    public static void main(String[] args) { // O(1)
        List<String> students = Arrays.asList( // O(n)
            "andrew", "akshat", "chris", "harshit", 
            "lary", "tim", "drake", "ashish", "shubham" // O(1) each
        );

        System.out.println(randomFunction(students)); // O(n)
    }

    public static int randomFunction(List<String> students) {
        String first = students.get(0);       // O(1)
        int total = 0;                        // O(1)
        List<String> newList = new ArrayList<>(); // O(1)

        for (String student : students) {     // O(n)
            total += 1;                       // O(1) for each → O(n) overall
            newList.add(student);             // O(1) for each → O(n) overall (amortized)
        }

        System.out.println(newList);          // O(n)
        return total;                         // O(1)
    }
}

/*
 Time Complexity:
students.get(0) → O(1)

Loop through students → O(n) for n elements.

newList.add() is O(1) per item → but done n times.

✅ Total Time Complexity: O(n)
*/
```
##### Simplfying Bio O notation  
Simplifying BIG O

Rule 1: Focus on Scalability- Consider large input
Rule 2: Considering Worst Case Scenario- always consider what might be max time  
Rule 3: Remove all possible constants  
Rule 4: Consider different variable for different inputs  
Rule 5: Remove all non-dominants  
![image](https://github.com/user-attachments/assets/e6faca07-82ed-4f7b-820e-3aa934814d93)  

#### Big O(n^2)  
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // O(n)
        int result = randomFunction(numList);
        System.out.println(result);
    }

    public static int randomFunction(List<Integer> numList) {
        int total = 0; // O(1)

        for (int num1 : numList) {            // O(n)
            for (int num2 : numList) {        // O(n)
                System.out.println(num1 + ", " + num2); // O(1)
                total += 1;                   // O(1)
            }
        }

        return total; // O(1)
    }
}
```
![image](https://github.com/user-attachments/assets/f78bc332-2705-4188-8fe8-7515b506f57b)

##### Rule 5 Removing non-dominant  
![image](https://github.com/user-attachments/assets/f616bc91-3ec7-4318-a627-ceea24d69edc)  

##### Space Complexity
Space complexity of an algorithm represents the amount of extra memory space needed the algorithm in its life cycle.  

We usually have 2 type of space requirement,  

To store our input data  

Extra space that we need to execute our program.  
![image](https://github.com/user-attachments/assets/20d9804d-cf02-4367-909a-4ac2a237865d) 

![image](https://github.com/user-attachments/assets/67ea5b90-e7d7-4a64-87c0-4648a2a3fce8)  
![image](https://github.com/user-attachments/assets/59cad49a-2ef4-449f-9b99-d23a2676e55f)  
- If im overwriting each element and storing in the space im taking only O(1) space.
#### If we want to have a good code:  
![image](https://github.com/user-attachments/assets/c803b1f2-a0bf-496f-a4ac-5d47cf6dfd05)  
#### Arrays  
-  Static - Fixed number of memory slot.
- Bynamic- Flexible number of memory slot.
- 4 Operations
  Access
  Search
  Insert
  Delete
##### Accessing  
Time Complexity - O(1)  
Wen we store array elements 
![image](https://github.com/user-attachments/assets/da984d2e-06ba-46c3-b14f-413970513731)
![image](https://github.com/user-attachments/assets/2f1b8a82-03d3-422e-bc8f-0110c959d0aa)  
![image](https://github.com/user-attachments/assets/f9a05b00-e3ea-4ba6-8092-918ec854568f)  
![image](https://github.com/user-attachments/assets/e9070fec-2820-4a22-8d94-3fac4a8719de)  
- Traversal -  is visitng each and every elements of array. so its TC-  Big O(n) - Linear
```java
public class CheckTen {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 10, 23, 7};

        boolean found = false;

        // Enhanced for-loop to traverse the array
        for (int num : numbers) {
            if (num == 10) {
                found = true;
                break; // Exit loop early if found
            }
        }

        // Print result
        if (found) {
            System.out.println("10 is found in the array.");
        } else {
            System.out.println("10 is NOT found in the array.");
        }
    }
}
```
- Insertion at first, mid or end of array.
![image](https://github.com/user-attachments/assets/21aec037-b1b5-43a9-a2bd-b29dd84bc19f)
![image](https://github.com/user-attachments/assets/1d11cc99-8670-4ac5-8ab3-b57ac5a271bf)
![image](https://github.com/user-attachments/assets/b294949d-f05e-4c5e-9f36-ddedf037c8ce)



















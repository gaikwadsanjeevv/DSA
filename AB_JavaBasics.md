### Complete Java : 
1. Variables  
A variable is a container that stores data in memory, which can be accessed and manipulated during program execution. 
 Variables have: NAME, TYPE, VALUE

2. Literals  
A literal is a fixed value directly written in the code that represents data. They are constants and are assigned to  
 variables or used in expressions.
Types of Literals:  
Integer literals: Whole numbers (e.g., 10, -20, 0).  
Floating-point literals: Numbers with decimal points (e.g., 3.14, -2.5).  
Character literals: A single character enclosed in single quotes (e.g., 'A', 'z').  
String literals: A sequence of characters enclosed in double quotes (e.g., "Hello, World!").  
Boolean literals: true or false.  
Null literal: null, which represents the absence of a value for object references.
```java
int number = 100;          // 100 is an integer literal
double pi = 3.14159;       // 3.14159 is a floating-point literal
char grade = 'A';          // 'A' is a character literal
String message = "Hi!";    // "Hi!" is a string literal
boolean isValid = true;    // true is a boolean literal
```
![image](https://github.com/user-attachments/assets/c22f3e55-d167-4c7a-bc4f-24604dabb430)  
Programme to convert Integer to Binary  
```java
import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Convert the integer to binary using Integer.toBinaryString()
        String binaryRepresentation = Integer.toBinaryString(number);

        // Display the result
        System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);
        
        scanner.close();
    }
}
```
![image](https://github.com/user-attachments/assets/c4f762b8-5856-436b-a992-31085ba52b2a)  

- Java is compiled as well interpreted - Hybrid. Java is first compiled in to .class file (byte code - which is not executable file but error free file) and then JVM interprete the file to run. The JVM is not generating any new file converting into machine code by JIT Compiler and execute the file. I C And C++ files they have system calls for a particular OS and so they are platform dependent.  
  ![image](https://github.com/user-attachments/assets/ee6af006-a36a-4ff3-ae10-388a2905af66)
  



================================================================================
## Java Collections
Java Collections provide a framework for organizing, managing, and manipulating groups of objects in various data structures, such as lists, sets, and maps. It enables efficient storage, retrieval, and operations on collections of data.  

#### LIMITATION OF ARRAY:   
- Cannot change size
- To increase or decrease the array u have to make another array-
- We want an array which can change size dynamically

#### - Our needed Application need: 
- Ex : Variable size collection:  ArrayList, LinkedList -  
- Distinct collection - Set  
- Sorted elements - Sortedset  
- insert  
- delete  
- Search - we require linear search or binary search to be built in of collections and java provides it.  
- Hashing - (key, value)- Java provide class for searching by hashing technique.  

### Collection framework in Java 
- Java provides colllection framework in form of interfaces and classes which are organized in the form of a hierarchy.

![image](https://github.com/user-attachments/assets/280621de-f65b-4378-acbf-64d5600eb631)
-these collection classes and interfaces are generic since collection also support any type of object.
Methods of interface collection :
Ex :  ![image](https://github.com/user-attachments/assets/f8845dba-1891-460e-9057-a08f5bcb52eb)  
- add(E e) c1.addAll(c2)  
- addAll(collection<E>c)  
- remove(object 0)  c1.removeAll(c2)  
- removeAll(collection<E> c)  
- retainAll(collection<E>c)  like remove but it will retain or keep all element of c2 and remove c1 if we write c1.retailAll(c2)  
- clear() //will clear all collection  
- isEmpty() //will check wether the collection is Empty or not
- contains(object o) //will check contains a particular object in collection
- containsAll(collection<E> c) //checks whether a collection is completely present in other or not
- equals(object o) // compares if 2 colllections are same or not  
  size()  
- iterator() //visiting through all the elements of collection    
- toArray() //you can convert an array to an collection  

### List Interface  
- List Interface extends collection framweork  (means what ever methods we read above also present for List with addition s more methods)
- ![image](https://github.com/user-attachments/assets/4b88af42-1f1a-45eb-bfde-442c803e7eca)
- add(int index, E e) //will add an element at an index
- addAll(int index, collection<E>e) //i want to add more than one element starting from any index
- remove(int index) //remove an object at given index
- get(int index) //to know what object is there at particular index
- set(int index, E e) //we can chnage an object at a given index
- Difference between add and set - add will add an new element by making a space and set will change an element at a particular index.
- sublist(int from int to) //i want a part of list from a place to other it wont remove them just we get the copy of them.
- indexOf(object o) - //getting index of particular object
- LastIndexOf()- //searching from last
- ListIterator() -//will aloow you to iterate the elements in either direction. bidirectional.
- listIterator(int Index)- //we can start from a particular index either forward or backward.
- Now we all saw some extra methods for list because of indexes.

  ### Set extends collection
  -set extends collection and it dont have extra methods it extends only collection methods.
  - Unorder - unique collection of objects- no indexs
  - ### Queue extends collection:
  - it has all methods of collection with some new elements.  
- add(E e) //wont ask just add at the end of collection
- poll() //remove first object if poll is empty will return null  
- remove() // remove first object but here when element is not there it thorws exception - no such elementexception
- peek() //just want to know what is element at first place if element is not there says null  
- element() // does same like peek but throws exception if element is not there.
  
### ArrayList  




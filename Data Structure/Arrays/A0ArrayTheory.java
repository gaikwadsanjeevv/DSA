/*
An array also referred to as a collection of elements, is the simplest and most widely used Data Structure. 
Most of the Data Structures (e.g.Stack and Queue) were derived using the Array structure, which is why it is known as one of the central building blocks
of Data Structures.

Each data element is assigned a numerical value called the index, which corresponds to the position of that item in the array.
It is important to note that the value of the index is non-negative and always starts from zero. 
So the first element of an array will be stored at index 0 and the last one at index size-1.

Arrays can store primitive data-type values (e.g., int, char, floats, boolean, byte, short, long, etc.), non-primitive data-type values (e.g., Java Objects, etc.) 
or it can even hold references of other arrays. That divides the arrays into two categories:

One Dimensional Array
Multi-Dimensional Array

How are arrays stored in memory? 
In Java, arrays are dynamically allocated. Arrays are stored in the memory using a reference pointer, which points to the first element. 
For example, if we create an array of size 3 and name it myArray, then the variable will point to the start of the array. See the figure below:

The only drawback of using arrays is that we have to specify the size of the array during the time of instantiation. 
That means the size remains fixed and can not be extended. If we want to add more elements, we will have to create a new array, 
copy all the items from the old array to the new one, and then insert the new element.

keyword new. This keyword is used whenever you want to create a new object on the heap. 
Not only that, but it will also return a reference to that object. This reference is then assigned to the variable.

❓ What is NullPointerException?
It happens when you try to use an object that is null (not properly created).

Example: You try to call a method or access a field on null — Java cannot allow it.

int[][] array = new int[][5]; // ❌ This is INVALID in Java
❌ You CANNOT do this!
In Java, you must declare rows first, because rows hold arrays.

Only rows can be unspecified initially, columns cannot be.

✅ In 2D Arrays, each cell (array[i][j]) holds a value (like int, char, String, etc.).

✅ In 3D Arrays, it's similar — but the structure is one level deeper.

Each cell (array[i][j][k]) can hold:

a primitive type value (like int, char, double)

or a reference to an object (like String, custom object, array, etc.)

Reference simply means:
Instead of holding the direct value, it points to another object/data structure.

✅ Here, each small box ([i][j][k]) directly stores an int.
int[][][] my3DArray = new int[2][3][4];

// Here my3DArray[0][1][2] holds an `int` value
my3DArray[0][1][2] = 5;

System.out.println(my3DArray[0][1][2]); // Output: 5

String[][][] my3DArray = new String[2][2][2];

my3DArray[0][1][1] = "Hello";

System.out.println(my3DArray[0][1][1]); // Output: Hello
✅ Here, each cell stores a reference to a String object "Hello", not the value directly.

"Hello" is a String object created somewhere in memory

my3DArray[0][1][1] points (reference) to it.

 Reference to a data structure (array inside array)
 int[][][] complexArray = new int[2][2][];
complexArray[0][1] = new int[]{1, 2, 3};

System.out.println(complexArray[0][1][2]); // Output: 3
✅ Here, the last dimension is not fully fixed.

complexArray[0][1] points to an array [1, 2, 3].

Again, the cell stores a reference (pointer) to another array.

✅ In 3D, you usually call:

First: "Layer" (or sometimes "Plane" or "Depth")

Second: "Row"

Third: "Column"



*/

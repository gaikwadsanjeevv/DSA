```Java
An array also referred to as a collection of elements, is the simplest and most widely used Data Structure. Most of the Data Structures (e.g.Stack and Queue) were derived using the Array structure, which is why it is known as one of the central building blocks of Data Structures. These Data Structures will be discussed later in the coming chapters. The purpose of an Array is to group similar kinds of data for fast access.

Each data element is assigned a numerical value called the index, which corresponds to the position of that item in the array. It is important to note that the value of the index is non-negative and always starts from zero. So the first element of an array will be stored at index 0 and the last one at index size-1.

Arrays can store primitive data-type values (e.g., int, char, floats, boolean, byte, short, long, etc.), non-primitive data-type values (e.g., Java Objects, etc.) or it can even hold references of other arrays. That divides the arrays into two categories:

One Dimensional Array
Multi-Dimensional Array
In primitive array, values are stored in a contiguous memory location. Whereas, in the non-primitive array, objects are stored in the heap segment.

How are arrays stored in memory? 
In Java, arrays are dynamically allocated. Arrays are stored in the memory using a reference pointer, which points to the first element. For example, if we create an array of size 3 and name it myArray, then the variable will point to the start of the array.

Drawback: 
The only drawback of using arrays is that we have to specify the size of the array during the time of instantiation. That means the size remains fixed and can not be extended. If we want to add more elements, we will have to create a new array, copy all the items from the old array to the new one, and then insert the new element.

Two Dimensional Arrays
A Two Dimensional Array is an array of references that holds references to other arrays. These arrays are preferably used if you want to put together data items in a table or matrix-like structure. Matrices are widely used in the field of Game Development, where you are required to store and update the location of the player at each second.

  int[][] myArray = new int[10][] ;   ==> The code given will result in a NullPointerException. The reason is that in line 4, we only allocate memory for the rows. You need to allocate memory for the columns as well.

You can use 3D Arrays if you want to assemble your data in a “cube-like” structure. These arrays are indexed by three variables, one for each dimension.
```
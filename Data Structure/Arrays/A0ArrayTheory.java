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
*/

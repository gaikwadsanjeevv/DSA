## Java Collections
Java Collections provide a framework for organizing, managing, and manipulating groups of objects in various data structures, such as lists, sets, and maps. It enables efficient storage, retrieval, and operations on collections of data.  

#### lIMITATION OF ARRAY:   
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
- 
![image](https://github.com/user-attachments/assets/280621de-f65b-4378-acbf-64d5600eb631)
-these collection classes and interfaces are generic since collection also support any type of object.
Methods of interface colelction :
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
- size()  
- iterator() //visiting through all the elements of collection    
- toArray() //you can convert an array to an collection  




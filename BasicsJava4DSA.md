
## Collections: 
### List
### Set
### Queue
### Map


### List : 
 List is a part of the Collection framework and is an ordered collection that allows duplicate elements.  
 Key Features of List  
Order Preservation: Elements are maintained in the order they are inserted.  
Duplicate Elements: Allows duplicate elements.  
Dynamic Size: Automatically resizes itself when elements are added or removed.  
multiple implementations of the List interface:  

### ArrayList  

Backed by a dynamic array.  
Allows fast random access.  
Not synchronized (not thread-safe).  

### LinkedList  

Implemented using a doubly linked list- forward and backward.  
Better for frequent insertions and deletions.  
Iteration is slower than ArrayList
Not synchronized.  

### Vector  

Synchronized (thread-safe).  
Slightly slower due to synchronization overhead.  
Mostly replaced by ArrayList for single-threaded use.  

### CopyOnWriteArrayList  

A thread-safe version of ArrayList.  
Used when traversal operations dominate updates (e.g., reading more often than writing).  


### List Creation  : 
```java
package Basics4DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class list {

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Cat");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("Cat"));
        System.out.println(words.indexOf("Cat"));
}
}
```
// As the List is immutable, we have to go with list implementation
// and we can convert the above list 'words' into immutable as follow:

```java
  List<String> wordsArrayList = new ArrayList<String>(words);
//we can also declare above line as below - new syntax:
  List<String> wordsArrayList = new ArrayList<>(words);
        List<String> wordsLinkedList = new LinkedList(words);
        List<String> wordsVector = new Vector<String>(words);
```


 Underneath an ArrayList and Vector is an Array. In which we can access any element faster based on index, but adding and deleting the elements in array is time consuming, and beneath a linked list is likedlist- for linked list inserting and deleting an element is much more easier. 

Now when to use ArrayList and linkedList - When you have very few insertion and deletions very few modification in the list and you want to access the elements based on position we go dfor array list.
If we have numbers of Addition and deletion of elememts we would take linked list.

Vector list is from java version 1 and arraylist came later in 1.2 Now earlier when we want to declare list we used vector.

Now in vector when we trimToSize it is synchronized - thread safe rather in array list is not syncronized. If 25  methods are syncronized and if the application have some threads so one of thread can use one of the method at a time to make programme thread safe.  But thread safety comes with cost like when one thread is completing the execution of syncronized method then other thread has to wait. Also there are other ways for thread safe - called as concurrent collections.

Operations on The List: 
```java
wordsArrayList.add("Dog");
        System.out.println(wordsArrayList);
wordsArrayList.add(2, "Ball");   //adding ball at 2nd index position
        System.out.println(wordsArrayList);

 List<String> newList = List.of("sanju", "Raju","Jack");  //joining 2 lists
        wordsArrayList.addAll(newList);
        System.out.println(wordsArrayList);

        wordsArrayList.set(6, "Fish");
        System.out.println(wordsArrayList);
//removing element
 wordsArrayList.remove(2);
        wordsArrayList.remove("Dog");
        System.out.println(wordsArrayList);
```
So we can either add an element, add element at aspecific position or join 2 lists.

### Iteration of ArrayList
we are trying to acieve through 
for loop, for each, Iterator hasNext
```java          
 for(int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
         }

         for(String word : words){
            System.out.println(word);
         }

         Iterator wordsIterator = words.iterator();
         while(wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
         }
```



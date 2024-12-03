
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

### Where to use the above loops for Ietrator: 

If i have to fine words ending with at i can use enhanced loop
```java
List<String> newList = List.of("Bat", "Cat", "Hen");
List<String> newArrayList = new ArrayList<>(newList);

for(String word:newList) {
if(word.endsWith("at")) {
System.out.println(word);
}
}
```
but when you want to delete or remove elements, enhanced for loop wont help much. so wen can use enhanced loop to find elements or presence.

```java
 Iterator<String> words_Iterator = wordsArrayList.iterator();
         while(words_Iterator.hasNext()) {
            if(words_Iterator.next().endsWith("at")) {
                           words_Iterator.remove();
                           System.out.println(words_Iterator);
            }

```

### Puzzles in List: 

we are creating a list of combinations of different data values as : 
 Paste belo codes on Jshell
 ```jshell
jshell> List value = List.of("A",'A',1,1.0)
jshell>value.get(2)
jshell> value.get(2) instanceof Integer
$3 ==> true   //shows we cant store primitive values in List hows it stored than, concept of Autoboxing - all this primitive values get autoboxed and a wrapper class is created.
jshell> value.get(2) instanceof Integer
$3 ==> true

jshell> value.get(3) instanceof Double
$4 ==> true

jshell> value.get(1) instanceof  Character
$5 ==> true
```
following is the table of conversion of primitive datatype to Wrapper after autoboxing.
### Primitive Data Type   	Wrapper Class
      byte	              Byte
      short	              Short
      int             	   Integer
      long	               Long
      float	               Float
      double           	   Double
      char            	    Character
      boolean	             Boolean

If i want to have specific kind of values, thats where we do generalization
so it allow only of one kind.
```jshell
jshell> List<String> textValues = List.of("A", 2)
|  Error:
|  incompatible types: inference variable E has incompatible bounds
|      equality constraints: java.lang.String
|      lower bounds: java.lang.Integer,java.lang.String
|  List<String> textValues = List.of("A", 2);
|                            ^-------------^
```

```jshell
jshell> List<Integer> nums = List.of(101,102,103,104,105)
jshell> List<Integer> numsAI = new ArrayList<>(nums);
numsAI ==> [101, 102, 103, 104, 105]
jshell> numsAI.remove(101)
|  Exception java.lang.IndexOutOfBoundsException: Index 101 out of bounds for length 5
|        at Preconditions.outOfBounds (Preconditions.java:64)
|        at Preconditions.outOfBoundsCheckIndex (Preconditions.java:70)
|        at Preconditions.checkIndex (Preconditions.java:266)
|        at Objects.checkIndex (Objects.java:359)
|        at ArrayList.remove (ArrayList.java:504)
|        at (#11:1)

jshell> numsAI.remove(0)
$12 ==> 101

jshell> numsAI
numsAI ==> [102, 103, 104, 105]
//we can remove element by index and if we want to remove by value we do as
jshell> numsAI.remove(Integer.valueOf(102))
$14 ==> true

jshell> numsAI
numsAI ==> [103, 104, 105]
```
### List and ArrayList - Sorting
```jshell
jshell> List<Integer> rannums = List.of(102,90, 76, 204, 304, 101, 97)
rannums ==> [102, 90, 76, 204, 304, 101, 97]

jshell> List<Integer> rannumsAI = new ArrayList<>(rannums);
rannumsAI ==> [102, 90, 76, 204, 304, 101, 97]

jshell> Collections.sort(rannumsAI)

jshell> rannumsAI
rannumsAI ==> [76, 90, 97, 101, 102, 204, 304]
```
### Programme to demonstarte sorting : 

Make 2 files:
```java
Main.java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(301, "Sanjeev"),
                new Student(101, "Raju"),
                new Student(204, "Jack"));
ArrayList<Student> studentAI = new ArrayList<>(students);
        Collections.sort(studentAI);
        // Print each Student
        System.out.println(studentAI);

        }
    }

Student.java
public class Student implements Comparable<Student>  {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id,that.id);
    }
}
```
Now to use compare sorting for an Non-generalised objects of List we go with Implementing Comparable of the object:
this: Refers to the current instance of the Student object on which the method is invoked.
that: Refers to the Student object passed as a parameter to the compareTo method.
For example:
Student student1 = new Student(101, "Sanjeev");
Student student2 = new Student(102, "Raju");
student1.compareTo(student2);
Here, this refers to student1.
that refers to student2.


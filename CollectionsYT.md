## Collections  
The Collection interface in Java is a part of the Java Collections Framework. It extends the Iterable interface, which specifies a mechanism to sequentially access the elements of an iterable object using an iterator.  

Key Points:  
Collection is an Interface:  

The Collection interface is a blueprint for data structures like lists, sets, and queues.  
Being an interface, Collection cannot be instantiated directly. Instead, concrete classes like ArrayList, HashSet, or LinkedList implement the Collection interface and provide functionality.  
Iterable Interface:  

The Collection interface extends the Iterable interface.  
This means all collection classes (like ArrayList or HashSet) can be iterated using an iterator or enhanced for-loop (for-each loop).  
Purpose of Collection:  

It provides a common framework for storing and manipulating groups of objects.  
Methods like add(), remove(), contains(), size(), and clear() are defined in the Collection interface and implemented by its concrete subclasses.  
Important Subinterfaces:  

The Collection interface has several subinterfaces, including:    
List: Ordered collections (e.g., ArrayList, LinkedList).  
Set: Unordered collections with no duplicate elements (e.g., HashSet, TreeSet).  
Queue: FIFO data structures (e.g., PriorityQueue).  
![image](https://github.com/user-attachments/assets/79f96dfe-cf2f-494b-8568-77c6518284bd)  

Class implements an interface  
A class must use the implements keyword to implement an interface. It must provide concrete implementations for all the abstract methods declared in the interface.  
```java
interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Method implemented in MyClass.");
    }
}
```
```java
A class can implement multiple interfaces:  
class MyClass implements Interface1, Interface2 {
    // Must provide implementations for all methods in Interface1 and Interface2
}
```
Interface extends anaother interface  
An interface can extend one or more interfaces using the extends keyword. The extending interface inherits all the methods from its parent interfaces.  
```java
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Implemented parentMethod.");
    }

    @Override
    public void childMethod() {
        System.out.println("Implemented childMethod.");
    }
}
```
An interface can extend multiple interfaces:  
```java
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface CombinedInterface extends Interface1, Interface2 {
    void method3();
}
```
## Implementations:  
![image](https://github.com/user-attachments/assets/f6031b9c-fc89-4b0d-a022-c3abb4a95437)  
![image](https://github.com/user-attachments/assets/25879b54-ef74-4ee0-b805-cdc3183795f2)  






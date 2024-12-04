## Java

Methods in Java are blocks of code that perform specific tasks. They provide several benefits, including:  
Benefits:  
Code Reusability:  
Methods allow you to write code once and use it multiple times, eliminating redundancy and making your code more efficient.  
Modularity:  
Methods help break down complex programs into smaller, manageable units, improving code organization and readability.  
Abstraction:  
Methods hide implementation details, allowing you to focus on the functionality they provide rather than how they achieve it.  
Improved Readability:  
Methods make code easier to understand and maintain by breaking it into logical blocks with meaningful names.  
Easier Debugging:  
Isolating code into methods simplifies debugging by allowing you to focus on specific parts of your program.  


### Different Case Scenario for Methods in Java :
#### 1. Instance Methods  
Theory  
Instance methods are associated with an object of a class.
 They can access and modify instance variables and typically represent behaviors specific to an instance.
```java
class InstanceExample {
    int number;

    // Instance method to set the number
    void setNumber(int number) {
        this.number = number;
    }

    // Instance method to display the number
    void display() {
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        InstanceExample obj = new InstanceExample();
        obj.setNumber(10);
        obj.display();
    }
}
```
#### 2. Static Methods  
Theory  
Static methods belong to the class rather than any specific object.  
They can only access static variables and methods directly.  

```java
class StaticExample {
    static int count = 0;

    static void increment() {
        count++;
    }

    public static void main(String[] args) {
        StaticExample.increment();
        StaticExample.increment();
        System.out.println("Count is: " + StaticExample.count);
    }
}

```

#### 3. Void Methods  
Theory  
Void methods perform an operation but do not return a value.
 These are useful for tasks like printing or logging.  
```java
class VoidExample {
    void printMessage() {
        System.out.println("This is a void method.");
    }

    public static void main(String[] args) {
        VoidExample obj = new VoidExample();
        obj.printMessage();
    }
}

```
#### 4. Value-Returning Methods   
Theory  
Value-returning methods perform a computation and return a value.    
 The return type matches the type of the value.  
 ```java
class ReturnExample {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnExample obj = new ReturnExample();
        int result = obj.add(5, 10);
        System.out.println("Result: " + result);
    }
}

```
#### 5. Parameterized Methods  
Theory  
Parameterized methods take arguments that influence their behavior or result.  

Program  
```java
class ParameterExample {
    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        ParameterExample obj = new ParameterExample();
        obj.greet("Alice");
    }
}

```
#### 6. Constructor Methods  
Theory  
Constructors initialize objects when they are created.  
They have the same name as the class and no return type.  
```java
class ConstructorExample {
    int value;

    ConstructorExample(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value is: " + value);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(50);
        obj.display();
    }
}

```
#### 7. Overloaded Methods  
Theory  
Method overloading allows a class to have multiple methods with the same name but different parameter lists.  
```java
class OverloadExample {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(5);
        obj.display("Hello");
    }
}

```
#### 8. Overridden Methods  
Theory  
Method overriding allows a subclass to provide a specific implementation for a method already defined in its parent class.  

```java
class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display method");
    }

    public static void main(String[] args) {
        Parent obj = new Child(); // Polymorphism
        obj.display();
    }
}

```
#### 9. Recursive Methods  
Theory  
Recursive methods call themselves to solve smaller instances of the same problem.  

```java
class RecursiveExample {
    int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        RecursiveExample obj = new RecursiveExample();
        int result = obj.factorial(5);
        System.out.println("Factorial: " + result);
    }
}

```

#### 10. Synchronized Methods  
Theory  
Synchronized methods prevent thread interference by allowing only one thread to access them at a time.  

```java
class SyncExample {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SyncExample obj = new SyncExample();
        Thread t1 = new Thread(obj::printNumbers);
        Thread t2 = new Thread(obj::printNumbers);
        t1.start();
        t2.start();
    }
}

```


#### 11. Abstract Methods  
Theory  
Abstract methods are declared without a body and must be implemented by subclasses.  

```java
abstract class AbstractExample {
    abstract void display();
}

class ConcreteExample extends AbstractExample {
    @Override
    void display() {
        System.out.println("Abstract method implemented.");
    }

    public static void main(String[] args) {
        ConcreteExample obj = new ConcreteExample();
        obj.display();
    }
}

```

12. Lambda Expressions  
Theory  
Lambda expressions simplify writing anonymous methods in functional programming contexts, often used with functional interfaces.

```java
interface Greet {
    void sayHello();
}

public class LambdaExample {
    public static void main(String[] args) {
        Greet greet = () -> System.out.println("Hello from Lambda!");
        greet.sayHello();
    }
}

```





















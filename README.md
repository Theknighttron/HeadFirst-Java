### The Basics:

- #### Variables in Java

Variable in java is a data container that stored data valued during java program execution.<br>
`int count`

##### Types of variable in java

1. Local Variables
   Variables that are declared inside the body of the method.
2. Instance Variables
   Variables that are declared outside any method, constructor or block.
   There defined without the static keyword.
3. Static Variables
   Variables that are initialized only once, at the time of of class loading before
   the execution of the program starts.
   There Shared among all instance of a class.

##### What is data types in java

Are defined as specifier that allocates different sizes and types of a value that a variable can store.

1. Primitive Types - (Integer, Character, Boolean, Float)
2. Non Primitive Types - (Classes, Arrays, Interfaces)

> Note:
> Java is a statically-typed language which means that all variables must be declared before it's used.

### The Way Java Works

    | Source |  ->  | Compiler  |   ->  |   Output(code) |  Virtual Machines |

### Code Structure in Java

    Source File -> [  Class Definition  ->  ( Methods  ->  {   Statements }  )   ]

What is Procedural Programming Language?
Can be defined as programming model which is derived from structured programming, based upon the concept of calling procedures.
Procedures also known as routines, subroutines, or functions. Simply consist of a series of computational steps to be carried out
during a program's execution, any given procedures might be called at any point.

What is Object Oriented Programming Language?
Can be defined as programming model which is based upon the concept of objects.
Object contains data in the form of attributes and code in the form of methods. In the object-oriented programming,
computer programs are designed using the concept of objects that interact with the real world.
Object-oriented programming languages are various but the most popular ones are class-based meaning that objects are instances
of classes, which also determine their types.

### When designing a class think about:

- Things the object knows
- Things the object does

```
class ShoppingCart {

    cartContents  --  *knows*

                  --  *does*
    addToCard()
    removeFromCart()
    checkOut()
}
```

```
class Button {
                -- *knows*
    label
    color
                --  *does*
    setColor()
    setLabel()
    push()
    release()
}
```

> Note:<br>
>
> - Instance variables - Things an object knows about itself<br>
> - Methods - Things an object can do

### Difference between a Class and Object?

> - A class is not an object (but it's used to construct them)
> - A class is a blueprint for an object. It tells the virtual machine how to make an object of that particular type.
> - Each object made from that class can have it's own values for the instance variables of that class.

### An object

> - The dot operator(.) gives you access to an object's state and behavior instances variables and methods.

Two uses of main:

- To test your real class
- To launch / start your Java application

### Java Garbage Collector

- Each time an object is created in Java, it goes into an area of memory known as **The Heap**.
  No matter when, where or how they're created - live on the heap.
- The Java heap is actually called the **Garbage Collection Heap**
- When you create an object, Java allocates memory space on the heap according to how much that particular object needs.
- An object with 15 instance variables will probably need more space than an object with only two instance variables.
- So how to you get an object out of the heap when you're done with it ??
  Java manages that memory for you! When the JVM(Java Virtual Machine) can see that an object can never be used again
  that object becomes eligible for garbage collection.
- And if you're running low on memory, The Garbage Collector will run, throw out the unreachable objects and free up the space
  to that the space can be reused.

### Variables

- Primitive
- Object Reference

> ### Primitive Types
>
> boolean -> (jvm-specifi) -> true or false<br>
> char -> 16bits -> 0 to 65535<br>
> byte -> 8bits -> -128 to 127<br>
> short -> 16bits -> -32768 to 32768<br>
> int -> 32bits -> -2147483648 to 2147483647<br>
> long -> 64 bits -> huge to huge<br>
> float -> 32bits -> varies<br>
> double -> 64 bits -> varies<br>

The java standard library includes lots of sophisticated data structure includes maps, tree, and sets,
and arrays are great when you just want a quick, ordered, and efficient list of things.
Arrays give you fast random access by letting you use and index position to get to any element in the array.

> Note:<br>
> Once you've declared an array, you can't put anything in it except things that are compatible array type.

- Arguments are the things you pass into the methods.
- Parameter is nothing more than a local variable. A variable with a type and a name that can be used inside the body of the method.

> Note:<br>
> Java is pass by value That means pass by copy

## Getter and Setters

- Getter and Setters are formally called Accessors and Mutators

### Encapsulation

    Encapsulation in Java is a fundamental concept in object-oriented programming (OOP)
    that refers to the bundling of data and methods that operate on that data within a single unit,
    which is called a class in Java.
    Java Encapsulation is a way of hiding the implementation details of a class from outside access and
    only exposing a public interface that can be used to interact with the class.

    In Java, encapsulation is achieved by declaring the instance variables of a class as private,
    which means they can only be accessed within the class.
    To allow outside access to the instance variables,public methods called getters and setters are defined,
    which are used to retrieve and modify the values of the instance variables, respectively.
    By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent.

> Instace variables always get a default value. If you don't explicitly assign a value to an instance variable
> or don't call a setter instance variable still has a value.<br>
> You don't have to initialize instance variables because they always have a default value.

> Note:<br>
> Instances variables are declared inside a class but not within a method WHILE Local variables are defined withing a method.

### Developing a class:

(Methodology/Process/Approach to writing code)

- Figure out what the class is suppose to do
- List the instance variables and methods
- Write the prep code for the methods.
- Write test code for the methods.
- Implement the class
- Test the Methods
- Debug and reimplement as needed

### The three things to write for each class:

```
  [ prep code ] -> [ test code ] -> [ real code ]
```

Prep code:<br>
A form of pseudocode, to help you focus on the logic without stressing about syntax.

Test code:<br>
A class or methods that will test the real code and validate that it's doing the right thing.

Real code:<br>
The actual implementation of the class. This is where we write real java code.

### Test-Driven Development

Partial list of key ideas in TDD:

1. Write the test code first
2. Develop in iteration cycles
3. Keep it(the code) simple
4. Refactor (improve the code) whenever and wherever you notice the opportunity
5. Don't release anything until it passes all the tests.
6. Don't put in anything that's not in the spec(no matter how tempted you are to put in functionality "for the future" )
7. No killer schedules; work regular hours

### Regular (non-enhanced loops)

for (int i = 0; i < 100; i++) {}

---

int i = 0;
while (i < 8) {
i++;
}

### Enhanced for loops

for (String name : nameArray) {}

### Overloading

Method Overloading is nothing more than having two methods with the same name but different arguments list.
It has nothing to do with inheritance and polymorphism.

An interface it's a 100% abstract class.
What's an abstract class - it's a class that can't be instantiated.

To stop a class from being instantiated use the word **abstract**. The Compiler will stop any code, anywhere from
from ever creating an instance of that type.

```
abstract class Canine extends Animal {
    public void roam(){}
}
```

An abstract class has virtually no use, no value, no purpose in life unless its extended.
With an abstract class, it's the **instance of the subclass** of your abstract class that's doing the work at runtime.

Concrete class is a class that it's not abstract.

### Abstract methods

- An abstract method means the method must be overridden.
- An abstract method has no body;
  `public abstract void eat();` -- No method body so it ends with a semicolon
- if you declare an abstract method, you must mark the class abstract as well. You can't have an abstract method in a non-abstract class.
- but you can mix both abstract and non-abstract method in the abstract class.
- You must implement all abstract methods.

Note:

> Every class in a Java extends class object
> Class Object is a mother of all classes; it's the superclass of everything.

### Multiple inheritance

The Deadly Diamond Of Death -> Refers to one class having two super classes.

### Java interface

A Java interface solves your multiple problem by giving you much of the polymorphism benefits
of multiple inheritance without the pain and suffering from the Deadly Diamond of Death(DDD).

The way interface solve the DDD problem is **by making all the methods abstract** that way
the subclass must implement the methods. So that at runtime the JVM ins't confused about
which of the two inherited version it's supposed to call.

A java interface is like a 100% pure abstract class.

> To define an interface:

    `public interface Pet`

> To implement an interface:

    `public class Dog extends Canine Implement Pet {...}`

### Making and Implementing the interface

Note:

> Interface methods are implicitly **public and abstract**
> It's optional (in fact it's not considered good style) to type the words in.

    ```
    public interface Pet {
        public abstract void beFriendly();
        public abstract void play();
    }
    ```

    ```
    public class Dog extends Canine implements Pet {
        // Methods implementing the Pet interface
        public void beFriendly() {...}
        public void play() {...}

        // Normall overriding methods
        public void roam() {...}
        public void eat() {...}
    }
    ```

Note:

> Single Parents Only: A java class can have only one parent (superclass)
> and that parent class defines who you are. But you can implement multiple interfaces and
> those interfaces defines roles you can play.

### How do you know whether to make a class, a subclass, an abstract class or an interface.

- Make **a class** that doesn't extends(other than objects) when your new class doesn't pass the IS-A test for any other type.

- Make **a subclass** (in other words, extends a class) only when you need to make a more specific version of a class and need to override
  or add new behavior.

- Use **an abstract class** when you want to define a template for a group of subclasses, and you have at least some implementation code that
  all subclasses could use. Make the class abstract when you want to guarantee that nobody can make objects of that type.

- Use **an interface** when you want to define a role that other classes can play, regardless of where those classes are in the inheritance tree.

## Stack And Garbage Collector

When the JVM(Java Virtual Machine) Starts up, it get a chunk of memory from the underlying OS and uses it to run your java program.

- How much memory ?
- And whether on not you can tweak it depended on which version of the JVM you're running.

Programmers care about the area of memory where:

- Object lives **(the heap)**
- Method invocations and local variables live **(the stack)**

All object live on the garbage-collectible heap

Note:

> Local variables are also called **Stack variables**

Instance variables - are declared inside a class but not inside a method, they represent the "fields" that each individual object has.
Local variables - are declared inside a method including method parameters. They're temporary and live as only as long as the method in on the stack.

    A call stakck with two methods:

                [ bar() {s} ] <- Stack Frames
                [ foo() {x}{i}{b} ] <-  Stack  Frames

    The method on top of the the stack is always the currently executing method.

What about local variables that are objects?
A non primitive variable hold a reference to an object and not object itself.
If the local variable is a reference to an object, only the local variable is a reference to an object, only the variable goes on the stack.

No matter WHERE the object reference variable is declared the object always, always and always goes on the heap.

## Multithreaded Programming

Refers to two or more parts that run concurrently --> (thread)

Project Based Multitasking -> is a feature that allows your computer to run two or more programs concurrently.
Thread Based Multitasking --> This means that a single program can perform two or more task simultaneously.

The Main Thread:

- It is the thread from which other "child" threads will be spawned.
- Often, it must be the last thread to finish execution because it performs various shutdown actions.

`static Thread currentThread()`

Creating a Thread:

- You can implement the Runnable interface

```
class NewThread implement Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "My Thread")   // Create a new second thread
    }

    // This is the entry point
    public void run() {

    }
}

class ThreadDemo {
    public static void main(String args[]) {
        NewThread nt = new NewThread(); // Create a new thread
        nt.t.start() // Start the thread
    }
}
```

- You can extend the Thread class

```
class NewThread extends Thread {
    NewThread() {
        // Create a new second thread
        super("Demo Thread")
    }

    // This is the entry point for the second thread
    public void run() {

    }
}

class ExtendThread {
    public static void main(String args[]) {
        NewThread nt = new NewThread(); // create a thread
        nt.start(); // start the thread
    }
}
```

To check if a thread has finish running:

- isAlive()
  `final boolean isAlive()`
- join()
  `final void join() throws InterruptedException`

### Terms:

JVM -> Java Virtual Machine<br>
Jar file -> Java Archive<br>
TDD -> Test Driven Development

### Q & A:

- #### How can i bundle multiple file and run when running them?<br>
  You can put all of your application files into .jar file that based on the pkzip format.
  Then include a simple text file formatted as something called a **manifest**, that defines
  which class in that jar holds the `main()` method that should run.

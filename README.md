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

# Variables

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

### Terms:

JVM -> Java Virtual Machine<br>
Jar file -> Java Archive

### Q & A:

- #### How can i bundle multiple file and run when running them?<br>
  You can put all of your application files into .jar file that based on the pkzip format.
  Then include a simple text file formatted as something called a **manifest**, that defines
  which class in that jar holds the `main()` method that should run.

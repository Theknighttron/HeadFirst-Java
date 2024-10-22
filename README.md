### Terms:

JVM -> Java Virtual Machine

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

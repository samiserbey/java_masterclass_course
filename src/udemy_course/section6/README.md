# Section 6: OOP Part 1 - Classes, Constructors and Inheritance
- classes are regular data type on steroids

## Classes
- instance variables/fields should be private `private double firstNumber;`
- getters, setters

## Constructors
- constructors can be overloaded (can have more than 1 constructor)
- it is possible to call one construct from another constructor `this(x, y, z);`
- must be first in constructor body
- general rule of thumb: only assign values to fields in the constructor

## Inheritence
- extends keyword
- methods can be ovveridden with @Override
- better to use method than super.method (easier when we need to override/primodify method later)
- every class has `Object` as a superclass

## Reference vs Object vs Instance vs Class
- a class is basically a blueprint for objects
- instances are created from class
- 2 references can point to the same/different object in memory
- the object in memory is accesed using a reference

## this vs super
- `super` is used to acess/call the parent class members (variables & methods)
- `this` is used to access/call the current class members (variables & methods)
- can't use them in static areas (static blocks/methods)
- can't use both this and super in same constructor

## Method overloading
- method overloading is having different methods of a class with the same name but different parameters (return type can be different too)
- method overloading reduce duplicate code and we don't have to remember multiple method names
- access modifiers = default, private, public, protected

## method overriding
- method overriding means defining a method in a child class that already exists in the parent class with same signature (same name, same arguments)
- @Override annotation for the compiler to read and check if it follow override rules
- only instance method can be overriden (not static)
- override rules:
    1. it must have same name and same arguments
    2. return type can be subclass of return type in the parent class
    3. can't have lower access modifier
- constructors and private methods cannot be overriden
- methods that are final cannot be overriden
- overriden methods must not throw a new or broader checked exception

## static vs instance method
- whenever you see a method that does not use instance variables or instance methods that method should be declared as a static method
- static methods are called as `ClassName.methodName();` or `methodName();`
- instance methods belong to an instance of a class

## static vs instance variables
- a static variable in a class is shared for every instance of that class (can be used for scanner for example)
- instance variables belongs to a specific instance of a class

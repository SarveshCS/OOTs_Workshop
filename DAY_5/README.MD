# DAY 5: Functional Interfaces & Lambda Expressions in Java

This folder introduces functional interfaces and lambda expressions in Java. These features enable concise, functional-style programming and are essential for modern Java development.

## What is a Functional Interface?

A functional interface is an interface with a single abstract method. It can have multiple default or static methods, but only one abstract method. Functional interfaces are the basis for lambda expressions in Java.

Example:

```java
@FunctionalInterface
interface MyFunction {
    int apply(int x, int y);
}
```

## What is a Lambda Expression?

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are used primarily to define the inline implementation of a functional interface.

Example:

```java
MyFunction add = (a, b) -> a + b;
```

## Contents

- [`FunctionalInterfaceDemo.java`](FunctionalInterfaceDemo.java): Demonstrates a custom functional interface and lambda expressions for addition and multiplication.
- [`LambdaExample.java`](LambdaExample.java): Shows a simple lambda expression using the Runnable interface.
- [`PredicateDemo.java`](PredicateDemo.java): Uses the built-in `Predicate` functional interface with a lambda.
- [`Assignment4.java`](Assignment4.java): (Your assignment file, if present)
- [`Car.java`](Car.java): (Other example file, if present)
- [`Vehicle.java`](Vehicle.java): (Other example file, if present)

## How to Run

Open any `.java` file and run using:

```sh
javac FileName.java
java FileName
```

## Key Concepts

- Functional Interfaces
- Lambda Expressions
- Built-in Functional Interfaces (`Predicate`, etc.)

---

For more details, see the code examples above. Try editing and running the files to experiment with lambda expressions and functional interfaces!

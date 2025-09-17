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

## Contents & Learning Path

This day is focused on understanding how Java supports functional programming through functional interfaces and lambda expressions. You will learn by reading, running, and experimenting with the following examples:

---

## Lambda Return: Implicit vs Explicit

In Java, lambda expressions can return a value in two ways:

**Implicit Return (Expression Lambda):**
```java
(a) -> a * a // No braces, no 'return' keyword needed
```
This is called an implicit return. The result of the expression after `->` is returned automatically. No braces `{}` or `return` keyword are required.

**Explicit Return (Block Lambda):**
```java
(a) -> { return a * a; }
```
Here, braces `{}` are used, and you must explicitly use the `return` keyword and a semicolon.

### Which is better?
For single-expression lambdas, implicit return is preferred and recommended by Java style guides. It is more concise and readable. Use block lambdas only when you need multiple statements inside the lambda body.

**Summary:**
- Use implicit return for simple, single-expression lambdas.
- Use block lambda with `return` only if you need multiple statements.

---

- [`FunctionalInterfaceDemo.java`](FunctionalInterfaceDemo.java): Learn how to define your own functional interface and use lambda expressions for basic math operations. Try changing the lambda to perform other operations!
- [`LambdaExample.java`](LambdaExample.java): See how lambdas can simplify code, such as implementing a Runnable for threads. Try making your own Runnable with a different message.
- [`PredicateDemo.java`](PredicateDemo.java): Discover Java's built-in functional interfaces like Predicate, and use lambdas to test conditions. Try writing your own Predicate for numbers or other types.
- [`CalC.java`](CalC.java): Build a simple calculator using lambda functions for add, subtract, multiply, and divide. This example shows how you can use lambdas to make your code modular and flexible. Run the program and try different operations!

## Teacher's Instructions & Topic Guide

1. **Functional Interfaces**: Explain that these are interfaces with a single abstract method, and are the foundation for lambda expressions. Use the examples to show how to declare and use them.
2. **Lambda Expressions**: Show how lambdas provide a concise way to implement functional interfaces. Discuss syntax and use cases.
3. **Built-in Functional Interfaces**: Introduce Java's standard library interfaces like Predicate, Consumer, Supplier, etc. Use PredicateDemo to illustrate.
4. **Practical Example (Calculator)**: Guide students to see how lambdas can be used in real applications, like a calculator. Encourage them to extend the example with more operations or error handling.

## How to Run & Key Concepts

Open any `.java` file and run using:

```sh
javac FileName.java
java FileName
```

### Key Concepts

- Functional Interfaces
- Lambda Expressions
- Built-in Functional Interfaces (`Predicate`, etc.)
- Real-world usage of lambdas (Calculator)

---

Read the explanations above, then open and run the code files. Try modifying the examples and see how lambda expressions make your code cleaner and more powerful!

## How to Run

Open any `.java` file and run using:

```sh
javac FileName.java
java FileName
```

### Key Concepts (Lambda)

- Functional Interfaces
- Lambda Expressions
- Built-in Functional Interfaces (`Predicate`, etc.)

---

For more details, see the code examples above. Try editing and running the files to experiment with lambda expressions and functional interfaces!

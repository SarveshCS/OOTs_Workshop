// LambdaMethodParam.java
// Demonstrates passing a method as a parameter using functional interfaces
// For teaching: Shows how to use method references and lambdas as parameters

@FunctionalInterface
interface StringOperation {
    String operate(String s);
}

public class LambdaMethodParam {
    // Method that takes a StringOperation as a parameter
    public static void printTransformed(String s, StringOperation op) {
        System.out.println(op.operate(s));
    }

    public static void main(String[] args) {
        // Lambda as parameter
        printTransformed("hello", str -> str.toUpperCase());
        // Method reference as parameter
        printTransformed("world", String::toLowerCase);
    }
}

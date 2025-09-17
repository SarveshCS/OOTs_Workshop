// Demonstrates a functional interface and lambda expression
@FunctionalInterface
interface MyFunction {
    int apply(int x, int y);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction multiply = (a, b) -> a * b;
        System.out.println("Sum: " + add.apply(5, 3));
        System.out.println("Product: " + multiply.apply(5, 3));
    }
}

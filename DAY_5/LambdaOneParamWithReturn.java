interface OneParam {
    int op(int a);
}

public class LambdaOneParamWithReturn {
    public static void main(String[] args) {
        OneParam square = (a) -> a * a; // Implicit return: no need for 'return' keyword or braces
        System.out.println("Square: " + square.op(5));
    }
}

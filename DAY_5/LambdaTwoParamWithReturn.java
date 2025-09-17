interface TwoParam {
    int op(int a, int b);
}

public class LambdaTwoParamWithReturn {
    public static void main(String[] args) {
        TwoParam add = (a, b) -> a + b; // Implicit return: no need for 'return' keyword or braces
        System.out.println("Sum: " + add.op(5, 3));
    }
}

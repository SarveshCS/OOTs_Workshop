@FunctionalInterface
interface ThreeParamOperation {
    int operate(int a, int b, int c);
}

public class LambdaThreeParamWithReturn {
    public static void main(String[] args) {
        // Lambda with three parameters
        ThreeParamOperation sum = (x, y, z) -> x + y + z;
        System.out.println("Sum of 1, 2, 3: " + sum.operate(1, 2, 3));

        ThreeParamOperation product = (x, y, z) -> x * y * z;
        System.out.println("Product of 2, 3, 4: " + product.operate(2, 3, 4));
    }
}

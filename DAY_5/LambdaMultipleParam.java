// LambdaMultipleParam.java
// Demonstrates a lambda expression with multiple parameters using varargs
// For teaching: Shows how to use lambdas with variable number of arguments

@FunctionalInterface
interface MultiParamOperation {
    int operate(int... numbers);
}

public class LambdaMultipleParam {
    public static void main(String[] args) {
        // Lambda with multiple parameters (varargs)
        MultiParamOperation sum = (nums) -> {
            int result = 0;
            for (int n : nums) result += n;
            return result;
        };
        System.out.println("Sum of 1,2,3,4: " + sum.operate(1,2,3,4));
    }
}

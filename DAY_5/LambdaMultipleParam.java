@FunctionalInterface
interface MultiParamOperation {
    int operate(int... numbers);
}

public class LambdaMultipleParam {
    public static void main(String[] args) {
        MultiParamOperation sum = (nums) -> {
            int result = 0;
            for (int n : nums) result += n;
            return result;
        };
        System.out.println("Sum of 1,2,3,4: " + sum.operate(1,2,3,4));
    }
}

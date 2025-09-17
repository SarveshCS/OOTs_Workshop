@FunctionalInterface
interface StringOperation {
    String operate(String s);
}

public class LambdaMethodParam {
    public static void printTransformed(String s, StringOperation op) {
        System.out.println(op.operate(s));
    }

    public static void main(String[] args) {
        printTransformed("hello", str -> str.toUpperCase());
        printTransformed("world", String::toLowerCase);
    }
}

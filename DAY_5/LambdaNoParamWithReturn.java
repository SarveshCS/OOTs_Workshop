interface Shape {
    public String shape();
}

public class LambdaNoParamWithReturn {
    public static void main(String[] args) {
        int x = 12;
        Shape s = () -> {
            return "The Shape is: " + x;
        };
        String result = s.shape();
        System.out.println(result);
    }
}

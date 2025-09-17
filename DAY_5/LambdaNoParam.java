interface Shape {
    public String shape();
}

public class LambdaNoParam {
    public static void main(String[] args) {
        int x = 12;
        Shape s = () -> "The Shape is: " + x;
        String result = s.shape();
        System.out.println(result);
    }
}

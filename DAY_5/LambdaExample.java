// Simple lambda example with Runnable
public class LambdaExample {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello from Lambda!");
        r.run();
    }
}

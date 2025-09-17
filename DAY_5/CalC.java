// CalC.java - Simple Calculator using Lambda Functions
import java.util.Scanner;

@FunctionalInterface
interface Operation {
    double apply(double a, double b);
}

public class CalC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double x = sc.nextDouble();
        System.out.println("Enter second number:");
        double y = sc.nextDouble();
        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> b != 0 ? a / b : Double.NaN;

        double result;
        switch (op) {
            case '+': result = add.apply(x, y); break;
            case '-': result = sub.apply(x, y); break;
            case '*': result = mul.apply(x, y); break;
            case '/': result = div.apply(x, y); break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }
}

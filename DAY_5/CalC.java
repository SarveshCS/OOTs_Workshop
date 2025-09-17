import java.util.Scanner;

@FunctionalInterface
interface Operation {
    double apply(double a, double b);
}

public class CalC {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
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

        double result = switch (op) {
            case '+' -> add.apply(x, y);
            case '-' -> sub.apply(x, y);
            case '*' -> mul.apply(x, y);
            case '/' -> div.apply(x, y);
            default -> {
                System.out.println("Invalid operation");
                yield Double.NaN;
            }
        };
        System.out.println("Result: " + result);
        }
    }
}

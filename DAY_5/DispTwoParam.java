interface Disp {
    int show(int a);
}

public class DispTwoParam {
    public static void main(String[] args) {
        Disp sum = (a) -> a + 10; // Implicit return: no need for 'return' keyword or braces
        System.out.println("Sum with 10: " + sum.show(8));
    }
}

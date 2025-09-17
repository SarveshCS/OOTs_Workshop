interface Disp {
    int show(int a);
}

public class DispOneParam {
    public static void main(String[] args) {
        Disp doubleVal = (a) -> a * 2; // Implicit return: no need for 'return' keyword or braces
        System.out.println("Double: " + doubleVal.show(7));
    }
}

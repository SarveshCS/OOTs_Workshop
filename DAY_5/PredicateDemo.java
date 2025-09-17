// Using java.util.function.Predicate with lambda
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test("")); // true
        System.out.println(isEmpty.test("Java")); // false
    }
}

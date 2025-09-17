import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(90);
        marks.add(75);
        marks.add(88);
        for(int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
        marks.remove(2);
        for(int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        for(String f : fruits) {
            System.out.print(f + " ");
        }
        System.out.println();
    }
}

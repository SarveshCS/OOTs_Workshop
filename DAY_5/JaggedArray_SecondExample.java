public class JaggedArray_SecondExample {
    public static void main(String[] args) {
        String[][] items = new String[2][];
        items[0] = new String[] {"Apple", "Banana", "Cherry"}; 
        items[1] = new String[] {"Whiskers", "Shadow"}; 

        System.out.println("Jagged array with fruits and cat names:");
        for (String[] arr : items) {
            for (String element : arr) {
                System.out.println(element);
            }
        }
    }
}

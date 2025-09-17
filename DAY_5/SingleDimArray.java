public class SingleDimArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String[] cities = {"Delhi", "Mumbaii", "Chennai", "Kolkata"};
        for(String c : cities) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

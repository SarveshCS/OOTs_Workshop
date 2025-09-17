public class ArrayBasics {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        String[] names = {"Amit", "Sara", "John", "Priya"};
        for(String n : names) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

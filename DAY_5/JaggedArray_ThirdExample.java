public class JaggedArray_ThirdExample {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20},
            {30, 40, 50},
            {60}
        };

        System.out.println("Third example: jagged array of integers (array of arrays, one line):");
        for (int[] arr : numbers) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

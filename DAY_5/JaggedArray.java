public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][];
        jaggedArr[0] = new int[] {1, 2};
        jaggedArr[1] = new int[] {3, 4, 5};
        jaggedArr[2] = new int[] {6};

        for (int i = 0; i < jaggedArr.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

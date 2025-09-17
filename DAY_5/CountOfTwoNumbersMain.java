class CountOfTwoNumbers {

       public boolean compareCountOf(int[] arr, int arg1, int arg2) {
        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {
            if (num == arg1) {
                count1++;
            }
            if (num == arg2) {
                count2++;
            }
        }
        return count1 > count2;
    }
}

class CountOfTwoNumbersMain {
    public static void main(String[] args) {
        CountOfTwoNumbers count = new CountOfTwoNumbers();
          int[] arr = {1, 2, 3, 2, 1, 2, 4, 1};
        System.out.println(count.compareCountOf(arr, 1, 2)); 
        System.out.println(count.compareCountOf(arr, 2, 3)); 
        System.out.println(count.compareCountOf(arr, 4, 5)); 
        System.out.println(count.compareCountOf(arr, 2, 4)); 
    }
}
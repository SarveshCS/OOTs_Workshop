public class Main{
    public static void main(String[] args){
        int nums1, nums2[], nums3;
        nums1 = 5;
        nums3 = 6;

        nums2 = new int[]{7, 8};
        System.out.println(nums1);
        for (int x : nums2){
            System.out.println(x);
        }

        System.out.println(nums3);
    }
}